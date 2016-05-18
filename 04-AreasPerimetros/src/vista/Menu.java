package vista;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame{
	
	private JButton btnArea = new JButton("Areas");
	private JButton btnPerimetro = new JButton("Perímetros");
	private JLabel lbMensaje = new JLabel("Bienvenido, escoge una opción:");
	
	private Container c = getContentPane();

	public Menu() {
		super.setSize(320, 320);
		super.setTitle("Menú");
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	private void cargarControles(){
		c.setLayout(null);
		
		lbMensaje.setBounds(10, 10, 300, 30);
		btnArea.setBounds(10, 50, 300, 100);
		btnPerimetro.setBounds(10, 165, 300, 100);
		
		c.add(lbMensaje);
		c.add(btnArea);
		c.add(btnPerimetro);
	}
	
}
