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
 * Vista para calcular el area del triangulo
 * @author cesar
 * @version 1.0
 *
 */
public class ATriangulo extends JFrame {
	
	private JLabel lbBase = new JLabel("Medida de la base");
	private JLabel lbAltura = new JLabel("Medida de la altura");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular área");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase ATriangulo para inicializar el Frame
	 */
	public ATriangulo() {
		super.setTitle("Área Triangulo");
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
	/**
	 * Retorna el valor de la base en formato double
	 * @return Retorna el valor de la base en formato double
	 */
	public double getBase(){
		return Double.parseDouble(txtBase.getText());
	}
	/**
	 * Retorna el valor de la altura en formato double
	 * @return Retorna el valor de la altura en formato double
	 */
	public double getAltura() {
		return Double.parseDouble(txtAltura.getText());
	}
	
	/**
	 * Muestra el resultado de la operacion en la vista
	 * @param resultado Resultado de la operacion en formato String 
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
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Retorna el acceso al boton calcular
	 * @return Retorna el acceso al boton calcular
	 */
	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Método para limpiar las cajas de texto de la aplicación
	 */
	public void limpiarCajas() {
		txtBase.setText(null);
		txtAltura.setText(null);
	}
	
}
