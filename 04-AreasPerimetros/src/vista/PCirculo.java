package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PCirculo extends JFrame {
	
	private JLabel lbDiametro = new JLabel("Medida del diámetro del circulo");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtDiametro = new JTextField();
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	public PCirculo() {
		super.setTitle("Perímetro del circulo");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	private void cargarControles() {
		c.setLayout(null);
		
		lbDiametro.setBounds(10, 10, 300, 30);
		txtDiametro.setBounds(10, 40, 300, 30);
		btnCalcular.setBounds(10, 80, 300, 80);
		lbResultado.setBounds(10, 170, 300, 30);
		
		c.add(lbDiametro);
		c.add(txtDiametro);
		c.add(btnCalcular);
		c.add(lbResultado);
	}
	
	public double getDiametro() {
		return Double.parseDouble(txtDiametro.getText());
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
		txtDiametro.setText(null);
	}
	
}
