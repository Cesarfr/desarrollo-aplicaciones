package vista;

import java.awt.Container;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Screen extends JFrame {
	
	private JProgressBar barra = new JProgressBar();
	private JLabel lbImagen = new JLabel();
	private Container c = getContentPane();
	
	public Screen() {
		super.setTitle("Screen");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		lbImagen.setBounds(20, 20, 280, 280);
		barra.setBounds(20, 300, 280, 50);
		lbImagen.setIcon(new ImageIcon("images/image.jpg"));
		
		c.add(lbImagen);
		c.add(barra);
	}
	
	public int getValorBarra() {
		return barra.getValue();
	}
	
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

	public JProgressBar getBarra() {
		return barra;
	}
	
}
