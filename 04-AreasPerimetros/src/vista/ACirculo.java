package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ACirculo extends JFrame{
	
	private JLabel lbRadio = new JLabel("Medida del radio del circulo");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtRadio = new JTextField();
	private JButton btnCalcular = new JButton("Calcular área");
	
	private Container c = getContentPane();
	
	public ACirculo(){
		super.setTitle("Area del circulo");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}

	private void cargarControles() {
		c.setLayout(null);
		
		lbRadio.setBounds(10, 10, 300, 30);
		txtRadio.setBounds(10, 40, 300, 30);
		btnCalcular.setBounds(10, 80, 300, 80);
		lbResultado.setBounds(10, 170, 300, 30);
		
		c.add(lbRadio);
		c.add(txtRadio);
		c.add(btnCalcular);
		c.add(lbResultado);
	}
	
	public double getRadio() {
		return Double.parseDouble(txtRadio.getText());
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
		txtRadio.setText(null);
	}
	
}
