package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PTriangulo extends JFrame {
	
	private JLabel lbLado1 = new JLabel("Medida para el lado 1");
	private JLabel lbLado2 = new JLabel("Medida para el lado 2");
	private JLabel lbLado3 = new JLabel("Medida para el lado 3");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtLado1 = new JTextField();
	private JTextField txtLado2 = new JTextField();
	private JTextField txtLado3 = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	public PTriangulo() {
		super.setTitle("Perímetro del triangulo");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Metodo para cargar los controles de la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbLado1.setBounds(10, 10, 300, 30);
		txtLado1.setBounds(10, 40, 300, 30);
		
		lbLado2.setBounds(10, 80, 300, 30);
		txtLado2.setBounds(10, 120, 300, 30);
		
		lbLado3.setBounds(10, 160, 300, 30);
		txtLado3.setBounds(10, 200, 300, 30);
		
		btnCalcular.setBounds(10, 240, 300, 80);
		lbResultado.setBounds(10, 320, 300, 30);
		
		c.add(lbLado1);
		c.add(txtLado1);
		c.add(lbLado2);
		c.add(txtLado2);
		c.add(lbLado3);
		c.add(txtLado3);
		c.add(btnCalcular);
		c.add(lbResultado);
	}
	
	public double getLado1(){
		return Double.parseDouble(txtLado1.getText());
	}
	
	public double getLado2() {
		return Double.parseDouble(txtLado2.getText());
	}
	
	public double getLado3() {
		return Double.parseDouble(txtLado3.getText());
	}
	
	public void setResultado(String resultado) {
		lbResultado.setText(resultado);
	}
	
	public void onClickBtnCalcular(ActionListener al) {
		btnCalcular.addActionListener(al);
	}
	
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}

	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
	public void limpiarCajas() {
		txtLado1.setText(null);
		txtLado2.setText(null);
		txtLado3.setText(null);
	}
	
}
