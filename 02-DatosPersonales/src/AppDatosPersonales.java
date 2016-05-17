import javax.swing.JOptionPane;

/**
 * 
 * @author cesar
 *
 */
public class AppDatosPersonales {
	
	/**
	 * 
	 * @param args Metodo main de la aplicacion
	 */
	public static void main(String[] args) {
		String nombre, telefono, edad;
		
		nombre = JOptionPane.showInputDialog("Cual es tu nombre");
		telefono = JOptionPane.showInputDialog("Cual es tu telefono");
		edad = JOptionPane.showInputDialog("Cual es tu edad");
		
		Persona persona = new Persona(nombre, telefono, Integer.parseInt(edad));
		
		JOptionPane.showMessageDialog(null, String.format("Hola %s tu telefono es %s y tu edad es %s", nombre, telefono, edad));
		
		String color, sexo, correo, direccion, pelicula, musica, cp;
		
		color = JOptionPane.showInputDialog("Cual es tu color favorito");
		sexo = JOptionPane.showInputDialog("Cual es tu sexo");
		correo = JOptionPane.showInputDialog("Cual es tu correo electronico");
		direccion = JOptionPane.showInputDialog("Cual es tu direccion");
		cp = JOptionPane.showInputDialog("Cual es tu codigo postal");
		pelicula = JOptionPane.showInputDialog("Cual es tu pelicula favorita");
		musica = JOptionPane.showInputDialog("Cual es tu musica favorita");
		
		Persona personaDos = new Persona(nombre, telefono, Integer.parseInt(edad), color, sexo, correo, direccion, Integer.parseInt(cp), pelicula, musica);
		
		JOptionPane.showMessageDialog(null, String.format("Hola %s, tu telefono es: %s, tu edad es %s,"
				+ "\ntu color favorito es: %s,"
				+ "\ntu sexo es: %s,\ntu correo es: %s,\ntu direccion es: %s"
				+ "\ntu codigo postal es: %s,\ntu pelicula favorita es: %s\ny tu musica favorita es: %s",
				nombre, telefono, edad, color, sexo, correo, direccion, cp, pelicula, musica));
	}

}
