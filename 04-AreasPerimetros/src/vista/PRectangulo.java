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
 * Vista para calcular el perímetro del rectángulo
 * @author cesar
 * @version 1.0
 *
 */
public class PRectangulo extends JFrame {
	
	private JLabel lbBase = new JLabel("Medida de la base");
	private JLabel lbAltura = new JLabel("Medida de la altura");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular perímetro");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase PRectangulo para inicializar el Frame
	 */
	public PRectangulo() {
		super.setTitle("Perímetro del rectangulo");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Metodo para cargar los controles a la vista PRectangulo
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
	 * Metodo para obtener el valor de la base del rectángulo
	 * @return Base del rectángulo en formato double
	 */
	public double getBase(){
		return Double.parseDouble(txtBase.getText());
	}
	
	/**
	 * Metodo para obtener el valor de la altura del rectángulo
	 * @return ALtura del rectángulo en formato double
	 */
	public double getAltura() {
		return Double.parseDouble(txtAltura.getText());
	}
	
	/**
	 * Metodo que muestra el resultado de la operación en la vista
	 * @param resultado Resultado en formato String
	 */
	public void setResultado(String resultado) {
		lbResultado.setText(resultado);
	}
	
	/**
	 * WindowListener para la vista PCirculo
	 * @param wl Objeto de tipo WindowListener
	 */
	public void onClickBtnCalcular(ActionListener al) {
		btnCalcular.addActionListener(al);
	}
	
	/**
	 * ActionListener para el boton calcular
	 * @param al Objeto de tipo ActionListener
	 */
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}

	/**
	 * WindowListener para la vista PRectangulo
	 * @param wl Objeto de tipo WindowListener
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
		txtBase.setText(null);
		txtAltura.setText(null);
	}
	
}
