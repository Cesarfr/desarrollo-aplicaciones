package app;

import controlador.EventosMenu;
import vista.Menu;

/**
 * Clase principal de la aplicacion
 * @author cesar
 * @version 1.0
 *
 */
public class AreasPerimetros {
	/**
	 * Metodo main de la aplicacion
	 * @param args Argumentos del metodo
	 */
	public static void main(String[] args) {
		Menu vista = new Menu();
		EventosMenu controlador = new EventosMenu(vista);
		vista.setVisible(true);
	}

}
