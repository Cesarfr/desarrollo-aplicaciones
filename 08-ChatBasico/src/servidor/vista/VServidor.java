package servidor.vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 * Vista para el panel del servidor
 * @author cesar
 * @version 1.0
 *
 */
public class VServidor extends JFrame {
	
	private JLabel lbTitulo = new JLabel("<html><h2>Servidor</h2></html>", SwingConstants.CENTER);
	private JButton btnIniciar = new JButton("Iniciar servidor"); 
	private Container c = getContentPane();
	
	/**
	 * Constructor de la vista
	 */
	public VServidor() {
		super.setTitle("Servidor");
		super.setSize(400, 100);
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
		
		lbTitulo.setBounds(10, 10, 380, 30);
		btnIniciar.setBounds(10, 50, 380, 30);
		
		c.add(lbTitulo);
		c.add(btnIniciar);
	}
	
	/**
	 * Método para obtener el boton iniciar
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnIniciar() {
		return btnIniciar;
	}
	
	/**
	 * Método para agregar el ActionListener al boton iniciar
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnIniciar(ActionListener al) {
		btnIniciar.addActionListener(al);
	}
	
	/**
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoVentana(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
}
