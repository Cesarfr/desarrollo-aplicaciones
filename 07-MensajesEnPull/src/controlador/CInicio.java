package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.ConexionBD;
import modelo.Mensaje;
import modelo.Usuario;
import modelo.ValidarEmail;
import vista.VAgregarMensaje;
import vista.VCrearCuenta;
import vista.VInicio;

/**
 * Controlador de la vista VInicio
 * @author cesar
 * @version 1.0
 *
 */
public class CInicio implements ActionListener {
	
	private VInicio vista = new VInicio();
	private Usuario modelo = new Usuario();
	private ResultSet rs = null;
	private ArrayList<String> arrMens = new ArrayList<String>();
	
	/**
	 * Constructor de la clase
	 * @param vista Vista de tipo VInicio
	 * @param modelo Modelo de tipo Usuario
	 */
	public CInicio(VInicio vista, Usuario modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickAcceder(this);
		vista.onClickCrearCuenta(this);
	}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			Connection cdb = ConexionBD.getConexion().getConnSQLite();
			ValidarEmail ve = new ValidarEmail();
			
			if(e.getSource() == vista.getBtnAcceder()) {
				
				String email = vista.getEmail();
				String passwd = vista.getPasswd();
				if(ve.validate(email) == false) {
					vista.mostrarError("Escribe un email valido !");
				}else {
					int id = 0;
					String nombre = null;
					String apPat = null;
					String apMat = null;
					
					rs = modelo.regresaUsuario(cdb, email, passwd);
					while(rs.next()) {
						id = rs.getInt(1);
						nombre = rs.getString(2);
						apPat = rs.getString(3);
						apMat = rs.getString(4);
					}
					
					if(id != 0){
						VAgregarMensaje v = new VAgregarMensaje();
						Mensaje m = new Mensaje();
						CAgregarMensaje ca = new CAgregarMensaje(v, m);
						
						arrMens = m.getMensajes(cdb);
						for (int i = 0; i < arrMens.size(); i++) {
							v.getTaMensajes().append(arrMens.get(i));
						}
						v.getLbNombre().setText(String.format("Bienvenido: %s %s %s", nombre, apPat, apMat));
						v.getLbID().setText(Integer.toString(id));
						v.setVisible(true);
						vista.setVisible(false);
					}else {
						vista.mostrarError("El email o la contraseña son erroneos");
						vista.limpiarCajas();
					}
				}
			}else if(e.getSource() == vista.getBtnCrearCuenta()) {
				VCrearCuenta vc = new VCrearCuenta();
				Usuario us = new Usuario();
				CCrearCuenta cc = new CCrearCuenta(vc, us);
				vc.setVisible(true);
				vista.setVisible(false);
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
	}

}
