package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Vista para el inicio de sesion
 * @author cesar
 * @version 1.0
 *
 */
public class VInicio extends JFrame {
	
	private JLabel lbMensaje = new JLabel("<html><h2>Bienvenido al \"Mensajito\"</h2></html>");
	private JLabel lbInicio = new JLabel("INICIAR SESIÓN");
	private JLabel lbUser = new JLabel("Usuario:");
	private JTextField txtUser = new JTextField();
	private JLabel lbPasswd = new JLabel("Contraseña:");
	private JPasswordField txtPasswd = new JPasswordField();
	private JButton btnAcceder = new JButton("Acceder");
	private JButton btnCrearCuenta = new JButton("Crear cuenta");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase
	 */
	public VInicio() {
		super.setTitle("Inicio");
		super.setSize(320, 280);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		
		cargarControles();
	}
	
	/**
	 * Método para cargar los controles de la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbMensaje.setBounds(30, 10, 300, 30);
		lbInicio.setBounds(100, 50, 160, 30);
		lbUser.setBounds(20, 90, 100, 30);
		txtUser.setBounds(120, 90, 180, 30);
		lbPasswd.setBounds(20, 130, 100, 30);
		txtPasswd.setBounds(120, 130, 180, 30);
		btnAcceder.setBounds(20, 170, 280, 50);
		btnCrearCuenta.setBounds(80, 230, 160, 30);
		
		c.add(lbMensaje);
		c.add(lbInicio);
		c.add(lbUser);
		c.add(txtUser);
		c.add(lbPasswd);
		c.add(txtPasswd);
		c.add(btnAcceder);
		c.add(btnCrearCuenta);
		
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
	 * Método para obtener acceso al boton Acceder
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnAcceder() {
		return btnAcceder;
	}
	
	/**
	 * Método para obtener acceso al boton CrearCuenta
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}
	
	/**
	 * Método para agregar el evento ActionListener al boton Acceder
	 * @param al Evento ActionListener
	 */
	public void onClickAcceder(ActionListener al) {
		btnAcceder.addActionListener(al);
	}
	
	/**
	 * Método para agregar el evento ActionListener al boton CrearCuenta
	 * @param al Evento ActionListener
	 */
	public void onClickCrearCuenta(ActionListener al) {
		btnCrearCuenta.addActionListener(al);
	}
	
	/**
	 * Método para limpiar las cajas de texto de la aplicación
	 */
	public void limpiarCajas() {
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
	
}
