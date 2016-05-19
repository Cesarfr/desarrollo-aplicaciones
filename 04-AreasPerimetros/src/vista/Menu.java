package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Vista del menu principal
 * @author cesar
 * @version 1.0
 *
 */
public class Menu extends JFrame{
	
	private JButton btnArea = new JButton("Areas");
	private JButton btnPerimetro = new JButton("Perímetros");
	private JLabel lbMensaje = new JLabel("Bienvenido, escoge una opción:");
	
	private Container c = getContentPane();
	
	/**
	 * Constructor de la clase Menu
	 */
	public Menu() {
		super.setSize(320, 320);
		super.setTitle("Menú");
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Metodo para cargar los controles de la vista
	 */
	private void cargarControles(){
		c.setLayout(null);
		
		lbMensaje.setBounds(10, 10, 300, 30);
		btnArea.setBounds(10, 50, 300, 100);
		btnPerimetro.setBounds(10, 165, 300, 100);
		
		c.add(lbMensaje);
		c.add(btnArea);
		c.add(btnPerimetro);
	}
	
	/**
	 * ActionListener para el boton área
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnArea(ActionListener al){
		btnArea.addActionListener(al);
	}
	
	/**
	 * ActionListener para el boton perímetro
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnPerimetro(ActionListener al){
		btnPerimetro.addActionListener(al);
	}
	
	/**
	 * 
	 * @return Acceso al boton área
	 */
	public JButton getBtnArea() {
		return btnArea;
	}
	
	/**
	 * 
	 * @return Acceso al boton perímetro
	 */
	public JButton getBtnPerimetro() {
		return btnPerimetro;
	}
	
	/**
	 * Metodo para mostrar una alerta de error
	 * @param error Error en formato String
	 */
	public void mostrarError(String error){
		JOptionPane.showMessageDialog(this, error, "Error!", JOptionPane.ERROR_MESSAGE);
	}
	
}
