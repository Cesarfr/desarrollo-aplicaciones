import javax.swing.JOptionPane;

/**
 * 
 * @author cesar
 *
 */
public class Saludo {
	/**
	 * Método main de la clase Saludo que muestra el nombre de la persona 
	 * @param args
	 */
	public static void main(String[] args) {
		String nombre;
		nombre = JOptionPane.showInputDialog("Cual es tu nombre");
		JOptionPane.showMessageDialog(null, String.format("Hola %s", nombre));
	}
}
