package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PCuadrado extends JFrame {
	
	private JLabel lbLado = new JLabel("Medida del lado del cuadrado");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtLado = new JTextField();
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	public PCuadrado() {
		super.setTitle("Perímetro del cuadrado");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		lbLado.setBounds(10, 10, 300, 30);
		txtLado.setBounds(10, 40, 300, 30);
		btnCalcular.setBounds(10, 80, 300, 100);
		lbResultado.setBounds(10, 190, 300, 30);
		
		c.add(lbLado);
		c.add(txtLado);
		c.add(btnCalcular);
		c.add(lbResultado);
	}
	
	public double getLado(){
		return Double.parseDouble(txtLado.getText());
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
		txtLado.setText(null);
	}
	
}
