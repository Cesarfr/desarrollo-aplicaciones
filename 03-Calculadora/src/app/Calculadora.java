package app;

import controlador.EventosVentana;
import modelo.Operaciones;
import vista.Ventana;
/**
 * 
 * @author cesar
 *
 */
public class Calculadora {
	/**
	 * 
	 * @param args Método main de la aplicación Calculadora
	 */
	public static void main(String[] args) {
		Ventana vista = new Ventana();
		Operaciones modelo = new Operaciones();
		EventosVentana controlador = new EventosVentana(vista, modelo);
		
		vista.setVisible(true);
	}

}
