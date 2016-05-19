package app;

import controlador.EventosMenu;
import vista.Menu;


public class AreasPerimetros {

	public static void main(String[] args) {
		Menu vista = new Menu();
		EventosMenu controlador = new EventosMenu(vista);
		vista.setVisible(true);
	}

}
