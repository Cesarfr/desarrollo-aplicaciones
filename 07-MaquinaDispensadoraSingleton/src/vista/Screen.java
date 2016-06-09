package vista;

import java.awt.Container;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * Vista para el inicio de la aplicacion
 * @author cesar
 * @version 1.0
 *
 */
public final class Screen extends JFrame {
	
	private static final Screen s = new Screen();
	
	private JProgressBar barra = new JProgressBar();
	private JLabel lbImagen = new JLabel();
	private Container c = getContentPane();

	/**
	 * Constructor de la vista DetalleChocolates
	 */
	private Screen() {
		super.setTitle("Screen");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Método para retornar la instancia Screen
	 * @return Instancia de tipo Screen
	 */
	public static Screen instanciaScreen(){
		return s;
	}
	
	/**
	 * Método par cargar los controles a la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbImagen.setBounds(20, 20, 280, 280);
		barra.setBounds(20, 300, 280, 50);
		lbImagen.setIcon(new ImageIcon("images/image.jpg"));
		
		c.add(lbImagen);
		c.add(barra);
	}
	
	/**
	 * Método para obtener el valor de la barra
	 * @return Valor de la barra en formato int
	 */
	public int getValorBarra() {
		return barra.getValue();
	}
	
	/**
	 * Método para establecer el valor de la barra
	 * @param n Valor de la barra en formato int
	 */
	public void setValorBarra(int n) {
		barra.setValue(n);
	}
	
	/**
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoVentana(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Método para obtener el acceso a la barra de progreso
	 * @return Objeto de tipo JProgressBar
	 */
	public JProgressBar getBarra() {
		return barra;
	}
	
}
