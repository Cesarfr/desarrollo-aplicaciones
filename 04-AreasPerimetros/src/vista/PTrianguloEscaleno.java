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
 * Vista para calcular el perímetro del triángulo escaleno
 * @author cesar
 * @version 1.0
 *
 */
public class PTrianguloEscaleno extends JFrame {
	
	private JLabel lbLado1 = new JLabel("Medida para el lado 1");
	private JLabel lbLado2 = new JLabel("Medida para el lado 2");
	private JLabel lbLado3 = new JLabel("Medida para el lado 3");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtLado1 = new JTextField();
	private JTextField txtLado2 = new JTextField();
	private JTextField txtLado3 = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase PTrianguloEscaleno para inicializar el Frame
	 */
	public PTrianguloEscaleno() {
		super.setTitle("Perímetro del triángulo");
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
	
	/**
	 * Metodo para obtener el valor de lado 1 del triángulo
	 * @return Lado 1 del triángulo en formato double
	 */
	public double getLado1(){
		return Double.parseDouble(txtLado1.getText());
	}
	
	/**
	 * Metodo para obtener el valor de lado 2 del triángulo
	 * @return Lado 2 del triángulo en formato double
	 */
	public double getLado2() {
		return Double.parseDouble(txtLado2.getText());
	}
	
	/**
	 * Metodo para obtener el valor de lado 3 del triángulo
	 * @return Lado 3 del triángulo en formato double
	 */
	public double getLado3() {
		return Double.parseDouble(txtLado3.getText());
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
	 * WindowListener para la vista PTriangulo
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Metodo para acceder al boton calcular
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
		txtLado1.setText(null);
		txtLado2.setText(null);
		txtLado3.setText(null);
	}
	
}
