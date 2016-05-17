package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase Ventana que hace refrencia a la parte de la vista de la aplicación
 * @author cesar
 *
 */

public class Ventana extends JFrame{
	
	private JLabel lbN1 = new JLabel("Número 1");
	private JLabel lbN2 = new JLabel("Número 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JButton btnSuma = new JButton("+");
	private JButton btnResta = new JButton("-");
	private JButton btnMultiplicacion = new JButton("x");
	private JButton btnDivision = new JButton("\u00F7");
	
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase Ventana para inicializar el Frame
	 */
	public Ventana() {
		super.setTitle("Calculadora");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Método para cargar los controles de la aplicación a la ventana
	 */
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10, 10, 300, 30);
		txtN1.setBounds(10, 40, 300, 30);
		
		
		lbN2.setBounds(10, 70, 300, 30);
		txtN2.setBounds(10, 100, 300, 30);
		
		btnSuma.setBounds(20, 150, 50, 50);
		btnResta.setBounds(100, 150, 50, 50);
		btnMultiplicacion.setBounds(180, 150, 50, 50);
		btnDivision.setBounds(250, 150, 50, 50);
		
		lbResultado.setBounds(10, 220, 300, 20);
		
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMultiplicacion);
		c.add(btnDivision);
		
		c.add(lbResultado);
	}
	/**
	 * 
	 * @return Retorna el numero 1 en formato double
	 */
	public double getN1(){
		return Double.parseDouble(txtN1.getText());
	}
	/**
	 * 
	 * @return Retorna el numero 2 en formato int
	 */
	public double getN2(){
		return Double.parseDouble(txtN2.getText());
	}
	/**
	 * Establece el resultado en el label correspondiente
	 * @param resultado
	 */
	public void setResultado(String resultado){
		lbResultado.setText(resultado);
	}
	
	/**
	 * ActionListener para el evento de la operación suma
	 * @param al
	 */
	public void onClickSuma(ActionListener al){
		btnSuma.addActionListener(al);
	}
	/**
	 * ActionListener para el evento de la operación resta
	 * @param al
	 */
	public void onClickResta(ActionListener al){
		btnResta.addActionListener(al);
	}
	/**
	 * ActionListener para el evento de la operación multiplicación
	 * @param al
	 */
	public void onClickMultiplicacion(ActionListener al){
		btnMultiplicacion.addActionListener(al);
	}
	/**
	 * ActionListener para el evento de la operación división
	 * @param al
	 */
	public void onClickDivision(ActionListener al){
		btnDivision.addActionListener(al);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error
	 */
	public void mostrarError(String error){
		JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * 
	 * @return Acceso al botón suma
	 */
	public JButton getBtnSuma() {
		return btnSuma;
	}
	
	/**
	 * 
	 * @return Acceso al botón resta
	 */
	public JButton getBtnResta() {
		return btnResta;
	}
	
	/**
	 * 
	 * @return Acceso al botón multiplicación
	 */
	public JButton getBtnMultiplicacion() {
		return btnMultiplicacion;
	}
	
	/**
	 * 
	 * @return Acceso al botón división
	 */
	public JButton getBtnDivision() {
		return btnDivision;
	}
	
	/**
	 * Método para limpiar las cajas de texto de la aplicación
	 */
	public void limpiarCajas(){
		txtN1.setText(null);
		txtN2.setText(null);
	}
}
