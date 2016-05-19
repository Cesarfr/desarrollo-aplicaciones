package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PRectangulo extends JFrame {
	
	private JLabel lbBase = new JLabel("Medida de la base");
	private JLabel lbAltura = new JLabel("Medida de la altura");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	public PRectangulo() {
		super.setTitle("Perímetro del rectangulo");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}

	private void cargarControles() {
		c.setLayout(null);
		
		lbBase.setBounds(10, 10, 300, 30);
		txtBase.setBounds(10, 40, 300, 30);
		lbAltura.setBounds(10, 80, 300, 30);
		txtAltura.setBounds(10, 120, 300, 30);
		btnCalcular.setBounds(10, 160, 300, 60);
		lbResultado.setBounds(10, 230, 300, 30);
		
		c.add(lbBase);
		c.add(lbAltura);
		c.add(txtBase);
		c.add(txtAltura);
		c.add(btnCalcular);
		c.add(lbResultado);
	}
	
	public double getBase(){
		return Double.parseDouble(txtBase.getText());
	}
	
	public double getAltura() {
		return Double.parseDouble(txtAltura.getText());
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
		txtBase.setText(null);
		txtAltura.setText(null);
	}
	
}
