package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Vista para crear cuenta
 * @author cesar
 * @version 1.0
 *
 */
public class VCrearCuenta extends JFrame {
	
	private JLabel lbMensaje = new JLabel("<html><h2>Crear cuenta</h2></html>", SwingConstants.CENTER);
	private JLabel lbNombre = new JLabel("Nombre:");
	private JTextField txtNombre = new JTextField();
	private JLabel lbApPat = new JLabel("Ap. Paterno:");
	private JTextField txtApPat = new JTextField();
	private JLabel lbApMat = new JLabel("Ap. Materno:");
	private JTextField txtApMat = new JTextField();
	private JLabel lbUser = new JLabel("Usuario:");
	private JTextField txtUser = new JTextField();
	private JLabel lbPasswd = new JLabel("Contraseña:");
	private JPasswordField txtPasswd = new JPasswordField();
	private JButton btnCrearCuenta = new JButton("Crear cuenta");
	
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase
	 */
	public VCrearCuenta() {
		super.setTitle("Crear Cuenta");
		super.setSize(320, 330);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setLocationRelativeTo(null);
		
		cargarControles();
	}
	
	/**
	 * Método para cargar los controles de la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbMensaje.setBounds(10, 10, 300, 30);
		lbNombre.setBounds(10, 60, 90, 30);
		txtNombre.setBounds(120, 60, 180, 30);
		lbApPat.setBounds(10, 100, 90, 30);
		txtApPat.setBounds(120, 100, 180, 30);
		lbApMat.setBounds(10, 140, 90, 30);
		txtApMat.setBounds(120, 140, 180, 30);
		lbUser.setBounds(10, 180, 90, 30);
		txtUser.setBounds(120, 180, 180, 30);
		lbPasswd.setBounds(10, 220, 90, 30);
		txtPasswd.setBounds(120, 220, 180, 30);
		btnCrearCuenta.setBounds(20, 260, 280, 50);
		
		c.add(lbMensaje);
		c.add(lbNombre);
		c.add(txtNombre);
		c.add(lbApPat);
		c.add(txtApPat);
		c.add(lbApMat);
		c.add(txtApMat);
		c.add(lbUser);
		c.add(txtUser);
		c.add(lbPasswd);
		c.add(txtPasswd);
		c.add(btnCrearCuenta);
	}
	
	/**
	 * Método para obtener el valor de la caja nombre
	 * @return Cadena de texto del nombre
	 */
	public String getNombre() {
		return txtNombre.getText();
	}
	
	/**
	 * Método para obtener el valor de la caja appat
	 * @return Cadena de texto del appat
	 */
	public String getApPat() {
		return txtApPat.getText();
	}
	
	/**
	 * Método para obtener el valor de la caja apmat
	 * @return Cadena de texto del apmat
	 */
	public String getApMat() {
		return txtApMat.getText();
	}
	
	/**
	 * Método para obtener el valor de la caja usuario
	 * @return Cadena de texto del usuario
	 */
	public String getUser() {
		return txtUser.getText();
	}
	
	/**
	 * Método para obtener el valor de la caja password
	 * @return Cadena de texto del password
	 */
	public String getPasswd() {
		return txtPasswd.getText();
	}
	
	/**
	 * Método para obtener acceso al boton CrearCuenta
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}
	
	/**
	 * Método para agregar el evento ActionListener al boton CrearCuenta
	 * @param al Evento ActionListener
	 */
	public void onClickCrearCuenta(ActionListener al) {
		btnCrearCuenta.addActionListener(al);
	}
	
	/**
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoVentana(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Método para limpiar las cajas de texto de la aplicación
	 */
	public void limpiarCajas() {
		txtNombre.setText(null);
		txtApMat.setText(null);
		txtApPat.setText(null);
		txtUser.setText(null);
		txtPasswd.setText(null);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarMensaje(String error) {
		JOptionPane.showMessageDialog(this, error, "Mensaje", JOptionPane.WARNING_MESSAGE);
	}
}
