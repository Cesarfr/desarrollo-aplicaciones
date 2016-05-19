package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Vista de las opciones para calcular el perimetro
 * @author cesar
 * @version 1.0
 *
 */
public class OpcionesPerimetro extends JFrame {
	
	private JLabel lbMensaje = new JLabel("Escoge una figura:");
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnCirculo = new JButton("Círculo");
	private JButton btnRectangulo = new JButton("Rectángulo");
	private JButton btnTriangulo = new JButton("Triángulo");
	
	private Container c = getContentPane();
	
	/**
	 * Constructor de la vista OpcionesPerimetro
	 */
	public OpcionesPerimetro() {
		super.setTitle("Opciones Perímetro");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * 	Metodo para cargar los controles de la vista OpcionesPerimetro
	 */
	private void cargarControles() {
		c.setLayout(null);

		lbMensaje.setBounds(10, 10, 300, 30);
		btnCirculo.setBounds(10, 40, 300, 80);
		btnCuadrado.setBounds(10, 140, 300, 80);
		btnRectangulo.setBounds(10, 240, 300, 80);
		btnTriangulo.setBounds(10, 340, 300, 80);

		c.add(lbMensaje);
		c.add(btnCirculo);
		c.add(btnCuadrado);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
	}
	
	/**
	 * ActionListener del boton circulo
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickCirculo(ActionListener al) {
		btnCirculo.addActionListener(al);
	}
	
	/**
	 * ActionListener del boton cuadrado
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickCuadrado(ActionListener al) {
		btnCuadrado.addActionListener(al);
	}
	
	/**
	 * ActionListener del boton rectangulo
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickRectangulo(ActionListener al) {
		btnRectangulo.addActionListener(al);
	}
	
	/**
	 * ActionListener del boton triangulo
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickTriangulo(ActionListener al) {
		btnTriangulo.addActionListener(al);
	}
	
	/**
	 * WindowListener de la vista OpcionesPerimetro
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * 
	 * @return Acceso al boton cuadrado
	 */
	public JButton getBtnCuadrado() {
		return btnCuadrado;
	}
	
	/**
	 * 
	 * @return Acceso al boton circulo
	 */
	public JButton getBtnCirculo() {
		return btnCirculo;
	}

	/**
	 * 
	 * @return Acceso al boton rectangulo
	 */
	public JButton getBtnRectangulo() {
		return btnRectangulo;
	}
	
	/**
	 * 
	 * @return Acceso al boton triangulo
	 */
	public JButton getBtnTriangulo() {
		return btnTriangulo;
	}
	
	/**
	 * Metodo que muestra una alerta de error
	 * @param mensaje Mensaje en formato String
	 */
	public void muestraMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
}
