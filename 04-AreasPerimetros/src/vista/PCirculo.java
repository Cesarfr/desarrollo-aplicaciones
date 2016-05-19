package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Vista para calcular el perímetro del circulo
 * @author cesar
 * @version 1.0
 *
 */
public class PCirculo extends JFrame {
	
	private JLabel lbDiametro = new JLabel("Medida del diámetro del circulo");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtDiametro = new JTextField();
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase PCirculo para inicializar el Frame
	 */
	public PCirculo() {
		super.setTitle("Perímetro del circulo");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Método para cargar los controles de la aplicación a la ventana
	 */
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
	
	/**
	 * Metodo para obtener el valor del diametro
	 * @return Valor del diametro en fromato double
	 */
	public double getDiametro() {
		return Double.parseDouble(txtDiametro.getText());
	}
	
	/**
	 * Metodo que muestra el resultado de la operación
	 * @param resultado Resultado en formato String
	 */
	public void setResultado(String resultado) {
		lbResultado.setText(resultado);
	}
	
	/**
	 * ActionListener para el boton calcular
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnCalcular(ActionListener al) {
		btnCalcular.addActionListener(al);
	}
	
	/**
	 * WindowListener para la vista PCirculo
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Metodo para obtener el acceso al boton calcular
	 * @return Acceso al boton calcular
	 */
	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	
	/**
	 * Metodo que muestra una alerta de error 
	 * @param error Error en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Método para limpiar las cajas de texto de la aplicación
	 */
	public void limpiarCajas() {
		txtDiametro.setText(null);
	}
	
}
