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
 * Vista para calcular el perímetro del cuadrado
 * @author cesar
 * @version 1.0
 *
 */
public class PCuadrado extends JFrame {
	
	private JLabel lbLado = new JLabel("Medida del lado del cuadrado");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtLado = new JTextField();
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase PCuadrado para inicializar el Frame
	 */
	public PCuadrado() {
		super.setTitle("Perímetro del cuadrado");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Metodo para cargar los controles a la vista PCuadrado
	 */
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
	
	/**
	 * Metodo para obtener el valor del lado del cuadrado
	 * @return Lado del cuadrado en formato double
	 */
	public double getLado(){
		return Double.parseDouble(txtLado.getText());
	}
	
	/**
	 * Metodo que muestra el resultado de la operación en la vista
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
	 * WindowListener para la vista PCuadrado
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
		txtLado.setText(null);
	}
	
}
