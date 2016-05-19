package vista;

import java.awt.Container;
import java.awt.GraphicsDevice.WindowTranslucency;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Vista para calcular el area del circulo
 * @author cesar
 * @version 1.0
 *
 */
public class ACirculo extends JFrame{
	
	private JLabel lbRadio = new JLabel("Medida del radio del circulo");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtRadio = new JTextField();
	private JButton btnCalcular = new JButton("Calcular área");
	
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase ACirculo para inicializar el Frame
	 */
	public ACirculo(){
		super.setTitle("Área del circulo");
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
		
		lbRadio.setBounds(10, 10, 300, 30);
		txtRadio.setBounds(10, 40, 300, 30);
		btnCalcular.setBounds(10, 80, 300, 80);
		lbResultado.setBounds(10, 170, 300, 30);
		
		c.add(lbRadio);
		c.add(txtRadio);
		c.add(btnCalcular);
		c.add(lbResultado);
	}
	
	/**
	 * 
	 * @return Retorna el valor del radio en formato double
	 */
	public double getRadio() {
		return Double.parseDouble(txtRadio.getText());
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
	 * 
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
		txtRadio.setText(null);
	}
	
}
