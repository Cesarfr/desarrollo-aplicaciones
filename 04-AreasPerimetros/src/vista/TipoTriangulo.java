package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Vista para elegir el tipo de triángulo a calcular el perímetro
 * @author cesar
 * @version 1.0
 *
 */
public class TipoTriangulo extends JFrame {
	
	private JLabel lbSelecciona = new JLabel("Selecciona el tipo de triángulo");
	private JButton btnSelecciona = new JButton("Seleccionar");
	private String [] tipos = {"Equilatero", "Isoceles", "Escaleno"};
	private JComboBox<String> cmbTipo = new JComboBox<String>(tipos);

	private Container c = getContentPane();
	
	/**
	 * Constructor de la vista TipoTriangulo para inicializar el Frame  
	 */
	public TipoTriangulo() {
		super.setTitle("Selecciona tipo triángulo");
		super.setSize(320, 170);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}

	/**
	 * Metodo para cargar los controles de la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbSelecciona.setBounds(10, 10, 300, 30);
		cmbTipo.setBounds(10, 40, 300, 30);
		btnSelecciona.setBounds(10, 90, 300, 50);
		
		c.add(lbSelecciona);
		c.add(cmbTipo);
		c.add(btnSelecciona);
	}
	
	/**
	 * Método para obtener el tipo de triángulo 
	 * @return Tipo de triángulo elegido
	 */
	public String getTipo() {
		return cmbTipo.getSelectedItem().toString();
	}
	
	/**
	 * ActionListener para el boton Seleccionar
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnSeleccionar(ActionListener al) {
		btnSelecciona.addActionListener(al);
	}
	
	/**
	 * WindowListener para la vista TipoTriangulo
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoCerrar(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Metodo que retorna el acceso al boton selecciona
	 * @return Retorna el acceso al boton selecciona
	 */
	public JButton getBtnSelecciona() {
		return btnSelecciona;
	}

	/**
	 * Metodo que muestra una alerta de error 
	 * @param error Error en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
}
