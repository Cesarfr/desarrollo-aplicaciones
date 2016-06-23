package cliente.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;

import cliente.modelo.ConexionBD;
import cliente.modelo.Usuario;
import cliente.modelo.ValidarEmail;
import cliente.vista.VCrearCuenta;
import cliente.vista.VInicio;

/**
 * Controlador de la vista VCrearCuenta
 * @author cesar
 * @version 1.0
 *
 */
public class CCrearCuenta implements ActionListener, WindowListener {
	
	private VCrearCuenta vista = new VCrearCuenta();
	private Usuario modelo = new Usuario();
	
	/**
	 * Constructor de la clase
	 * @param vista Vista de tipo VCrearCuenta
	 * @param modelo Modelo de tipo Usuario
	 */
	public CCrearCuenta(VCrearCuenta vista, Usuario modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickCrearCuenta(this);
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
	 * Metodo par realizar acciones al maximizar la ventana
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al enfocar la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al desenfocar la ventana
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String nombre = null;
			String apPat = null;
			String apMat = null;
			String email = null;
			String passwd = null;
			
			if(e.getSource() == vista.getBtnCrearCuenta()) {
				nombre = vista.getNombre();
				apPat = vista.getApPat();
				apMat = vista.getApMat();
				email = vista.getEmail();
				passwd = vista.getPasswd();

				Connection cdb = ConexionBD.getConexion().getConnSQLite();
				ValidarEmail ve = new ValidarEmail();
				
				if(nombre.equals("") || nombre.equals(null)){
					vista.mostrarMensaje("Escribe un nombre para la cuenta!!");
				} else if(apPat.equals("") || apPat.equals(null)){
					vista.mostrarMensaje("Escribe un apellido paterno para la cuenta!!");
				} else if(apMat.equals("") || apMat.equals(null)){
					vista.mostrarMensaje("Escribe un apellido materno para la cuenta!!");
				} else if(email.equals("") || email.equals(null)){
					vista.mostrarMensaje("Escribe un email para la cuenta!!");
				} else if(ve.validate(email) == false){
					vista.mostrarMensaje("Escribe un email valido!!");
				} else if(passwd.equals("") || passwd.equals(null)){
					vista.mostrarMensaje("Escribe una contraseña para la cuenta!!");
				} else {
					int i = modelo.guardaUsuario(cdb, nombre, apPat, apMat, email, passwd);
					if (i == 1) {
						vista.mostrarMensaje("Usuario guardado con éxito!! \nAhora puedes iniciar sesión :)");
						vista.limpiarCajas();
					} else if(i == 2) {
						vista.mostrarError("El email escrito ya esta en uso, elige otro !");
					} else {
						vista.mostrarError("Ha ocurrido un error al guardar!!");
					}
				}
				
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
		
	}

}
