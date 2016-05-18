package vista;

import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Opciones extends JFrame{
	
	private JLabel lbMensaje = new JLabel("Escoge una figura:");
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnCirculo = new JButton("Círculo");
	private JButton btnRectangulo = new JButton("Rectángulo");
	private JButton btnTriangulo = new JButton("Triángulo");
	
	private Container c = getContentPane();
	
	public Opciones() {
		super.setTitle("Opciones");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}

	private void cargarControles() {
		c.setLayout(null);
		
		lbMensaje.setBounds(10, 10, 300, 30);
		btnCirculo.setBounds(10, 40, 300, 100);
		btnCuadrado.setBounds(10, 150, 300, 100);
		btnRectangulo.setBounds(10, 260, 300, 100);
		btnTriangulo.setBounds(10, 370, 300, 100);
		
		c.add(lbMensaje);
		c.add(btnCirculo);
		c.add(btnCuadrado);
		c.add(btnRectangulo);
		c.add(btnTriangulo);
	}
	
}
