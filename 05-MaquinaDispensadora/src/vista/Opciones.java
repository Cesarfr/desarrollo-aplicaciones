package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Vista para las opciones de compra
 * @author cesar
 * @version 1.0
 *
 */
public class Opciones extends JFrame{
	
	private JLabel lbTitulo = new JLabel("Estas son las opciones");
	private JButton btnDulces = new JButton("Dulces");
	private JButton btnChocolates = new JButton("Chocolates");
	private JButton btnGalletas = new JButton("Galletas");
	private JButton btnRefrescos = new JButton("Refrescos");
	private JButton btnPagar = new JButton("Pagar");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la vista Opciones
	 */
	public Opciones() {
		super.setTitle("Opciones");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Método par cargar los controles a la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbTitulo.setBounds(10, 10, 300, 30);
		btnChocolates.setBounds(10, 40, 300, 60);
		btnDulces.setBounds(10, 120, 300, 60);
		btnGalletas.setBounds(10, 220, 300, 60);
		btnRefrescos.setBounds(10, 320, 300, 60);
		btnPagar.setBounds(50, 400, 220, 40);
		
		c.add(lbTitulo);
		c.add(btnChocolates);
		c.add(btnDulces);
		c.add(btnGalletas);
		c.add(btnRefrescos);
		c.add(btnPagar);
	}
	
	/**
	 * Método para obtener el acceso al boton pagar
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnPagar() {
		return btnPagar;
	}
	
	/**
	 * Método para obtener el acceso al boton dulces
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnDulces() {
		return btnDulces;
	}
	
	/**
	 * Método para obtener el acceso al boton chocolates
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnChocolates() {
		return btnChocolates;
	}
	
	/**
	 * Método para obtener el acceso al boton galletas
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnGalletas() {
		return btnGalletas;
	}
	
	/**
	 * Método para obtener el acceso al boton refrescos
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnRefrescos() {
		return btnRefrescos;
	}
	
	/**
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoVentana(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * ActionListener para el boton dulces
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnDulces(ActionListener al) {
		btnDulces.addActionListener(al);
	}
	
	/**
	 * ActionListener para el boton Chocolates
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnChocolates(ActionListener al) {
		btnChocolates.addActionListener(al);
	}
	
	/**
	 * ActionListener para el boton galletas
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnGalletas(ActionListener al) {
		btnGalletas.addActionListener(al);
	}
	
	/**
	 * ActionListener para el boton refrescos
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnRefrescos(ActionListener al) {
		btnRefrescos.addActionListener(al);
	}
	
	/**
	 * ActionListener para el boton pagar
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnPagar(ActionListener al) {
		btnPagar.addActionListener(al);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
}
