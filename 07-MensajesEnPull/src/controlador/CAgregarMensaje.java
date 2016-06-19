package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.ConexionBD;
import modelo.Mensaje;
import modelo.Usuario;
import vista.VAgregarMensaje;
import vista.VInicio;

/**
 * Controlador de la vista VAgregarMensaje
 * @author cesar
 * @version 1.0
 *
 */
public class CAgregarMensaje implements ActionListener, WindowListener {
	
	private VAgregarMensaje vista = new VAgregarMensaje();
	private Mensaje modelo = new Mensaje();
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private ResultSet rs = null;
	
	/**
	 * Constructor de la clase
	 * @param vista Vista de tipo VAgregarMensaje
	 * @param modelo Modelo de tipo Mensaje
	 */
	public CAgregarMensaje(VAgregarMensaje vista, Mensaje modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickBtnEnviar(this);
		vista.eventoVentana(this);
	}

	/**
	 * Metodo para realizar acciones al abrir la ventana
	 */
	@Override
	public void windowOpened(WindowEvent e) {}
	
	/**
	 * Metodo para realizar acciones al intentar cerrar la ventana
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		VInicio v = new VInicio();
		Usuario u = new Usuario();
		CInicio c = new CInicio(v, u);
		v.setVisible(true);
		vista.setVisible(false);
	}
	
	/**
	 * Metodo par realizar acciones al cerrar la ventana
	 */
	@Override
	public void windowClosed(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al minimizar la ventana
	 */
	@Override
	public void windowIconified(WindowEvent e) {}
	
	/**
	 * Método par realizar acciones al maximizar la ventana
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {}
	
	/**
	 * Método par realizar acciones al enfocar la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {}
	
	/**
	 * Método par realizar acciones al desenfocar la ventana
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == vista.getBtnEnviar()) {
				
				Connection cdb = ConexionBD.getConexion().getConnSQLite();
				String mensaje = vista.getMensaje();
				String nombre = null;
				String apPat = null;
				String apMat = null;
				int id = vista.getID();
				Date date = new Date();
				String fecha = dateFormat.format(date);
				Usuario usr = new Usuario();
				
				if(mensaje.equals(null) || mensaje.equals("")) {
					vista.mostrarError("Ingresa un mensaje !!");
				}else {
					int resp = modelo.guardarMensaje(cdb, mensaje, id, fecha);
					if(resp == 1) {
						rs = usr.regresaNomUsuario(cdb, id);
						while(rs.next()) {
							nombre = rs.getString(1);
							apPat = rs.getString(2);
							apMat = rs.getString(3);
						}
						vista.getTaMensajes().append(
								String.format("%s \n %s %s %s,\n %s \n\n",
										mensaje, nombre, apPat, apMat, fecha));
						vista.limpiarCajas();
					}else {
						vista.mostrarError("Ha ocurrido un error al guardar!!");
					}
				}
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
	}
	
}
