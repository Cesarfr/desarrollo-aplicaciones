package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OpcionesArea extends JFrame {

	private JLabel lbMensaje = new JLabel("Escoge una figura:");
	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnCirculo = new JButton("Círculo");
	private JButton btnRectangulo = new JButton("Rectángulo");
	private JButton btnTriangulo = new JButton("Triángulo");

	private Container c = getContentPane();

	public OpcionesArea() {
		super.setTitle("Opciones Área");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		cargarControles();
	}

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

	public void onClickCirculo(ActionListener al) {
		btnCirculo.addActionListener(al);
	}

	public void onClickCuadrado(ActionListener al) {
		btnCuadrado.addActionListener(al);
	}
	
	public void onClickRectangulo(ActionListener al) {
		btnRectangulo.addActionListener(al);
	}
	
	public void onClickTriangulo(ActionListener al) {
		btnTriangulo.addActionListener(al);
	}
	
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	public JButton getBtnCuadrado() {
		return btnCuadrado;
	}

	public JButton getBtnCirculo() {
		return btnCirculo;
	}

	public JButton getBtnRectangulo() {
		return btnRectangulo;
	}

	public JButton getBtnTriangulo() {
		return btnTriangulo;
	}
	
	public void muestraMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
}
