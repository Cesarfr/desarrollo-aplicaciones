package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Opciones extends JFrame{
	
	private JLabel lbTitulo = new JLabel("Estas son las opciones");
	private JButton btnDulces = new JButton("Dulces");
	private JButton btnChocolates = new JButton("Chocolates");
	private JButton btnGalletas = new JButton("Galletas");
	private JButton btnRefrescos = new JButton("Refrescos");
	private Container c = getContentPane();
	
	public Opciones() {
		super.setTitle("Opciones");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		lbTitulo.setBounds(10, 10, 300, 30);
		btnChocolates.setBounds(10, 40, 300, 80);
		btnDulces.setBounds(10, 120, 300, 80);
		btnGalletas.setBounds(10, 200, 300, 80);
		btnRefrescos.setBounds(10, 280, 300, 80);
		
		c.add(lbTitulo);
		c.add(btnChocolates);
		c.add(btnDulces);
		c.add(btnGalletas);
		c.add(btnRefrescos);
	}

	public JButton getBtnDulces() {
		return btnDulces;
	}

	public JButton getBtnChocolates() {
		return btnChocolates;
	}

	public JButton getBtnGalletas() {
		return btnGalletas;
	}

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
}
