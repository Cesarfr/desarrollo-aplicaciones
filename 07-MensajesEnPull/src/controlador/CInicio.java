package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import modelo.ConexionBD;
import modelo.Usuario;
import vista.VAgregarMensaje;
import vista.VCrearCuenta;
import vista.VInicio;

public class CInicio implements ActionListener {
	
	private VInicio vista = new VInicio();
	private Usuario modelo = new Usuario();
	private ResultSet rs = null;
	
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
			if(e.getSource() == vista.getBtnAcceder()) {
				
				String usuario = vista.getUser();
				String passwd = vista.getPasswd();
				Connection cdb = ConexionBD.getConexion().getConnSQLite();
				
				int id = 0;
				String nombre = null;
				String apPat = null;
				String apMat = null;
				
				rs = modelo.regresaUsuario(cdb, usuario, passwd);
				while(rs.next()) {
					id = rs.getInt(1);
					nombre = rs.getString(2);
					apPat = rs.getString(3);
					apMat = rs.getString(4);
				}
				
				if(id != 0){
					VAgregarMensaje v = new VAgregarMensaje();
					
				}else {
					vista.mostrarError("El usuario o la contraseña son erroneos");
					vista.limpiarCajas();
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
