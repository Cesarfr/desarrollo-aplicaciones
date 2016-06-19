package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 * Vista para agregar un mensaje
 * @author cesar
 * @version 1.0
 *
 */
public class VAgregarMensaje extends JFrame {
	
	private JLabel lbNombre = new JLabel("Bienvenido: GG", SwingConstants.CENTER);
	private JLabel lbID = new JLabel();
	private JTextField txtMensaje = new JTextField();
	private JTextArea taMensajes = new JTextArea();
	private JScrollPane scroll = new JScrollPane();
	private JButton btnEnviar = new JButton("Enviar");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase
	 */
	public VAgregarMensaje() {
		super.setTitle("Agregar Mensaje");
		super.setSize(400, 440);
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
		
		lbNombre.setBounds(10, 10, 380, 30);
		taMensajes.setEditable(false);
		taMensajes.setLineWrap(true);
		taMensajes.setWrapStyleWord(true);
		scroll.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		taMensajes.setBounds(10, 50, 360, 280);
		scroll.setBounds(10, 50, 380, 300);
		scroll.setViewportView(taMensajes);
		txtMensaje.setBounds(10, 360, 270, 30);
		btnEnviar.setBounds(290, 360, 100, 30);
		
		c.add(lbNombre);
		c.add(lbID);
		c.add(scroll);
		c.add(txtMensaje);
		c.add(btnEnviar);
	}
	
	/**
	 * Método para retornar el mensaje escrito
	 * @return Mensaje escrito en formato String
	 */
	public String getMensaje() {
		return txtMensaje.getText();
	}
	
	/**
	 * Método para retornar el id
	 * @return ID del usuario en formato int
	 */
	public int getID() {
		return Integer.parseInt(lbID.getText());
	}
	
	/**
	 * Método para retornar el label para el ID del usuario
	 * @return Label para el ID del usuario 
	 */
	public JLabel getLbID() {
		return lbID;
	}
	
	/**
	 * Método para retornar el label para el nombre del usuario
	 * @return Label para el nombre del usuario 
	 */
	public JLabel getLbNombre() {
		return lbNombre;
	}
	
	/**
	 * Método para obtener acceso al textarea
	 * @return Objeto de tipo JTextArea
	 */
	public JTextArea getTaMensajes() {
		return taMensajes;
	}
	
	/**
	 * Método para obtener acceso al boton enviar
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnEnviar() {
		return btnEnviar;
	}
	
	/**
	 * Método para agregar el evento ActionListener al boton Enviar
	 * @param al Evento ActionListener
	 */
	public void onClickBtnEnviar(ActionListener al) {
		btnEnviar.addActionListener(al);
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
		txtMensaje.setText(null);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
}
