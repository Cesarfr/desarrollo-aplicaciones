package app;

import controlador.COpciones;
import vista.Opciones;
import vista.Screen;

/**
 * Clase principal de la aplicacion MaquinaDispensadora
 * @author cesar
 * @version 1.0
 *
 */
public class MaquinaDispensadoraSingleton {
	
	/**
	 * Método main de la aplicacion
	 * @param args Valores de la aplicacion 
	 */
	public static void main(String[] args) {
		
		Screen s = Screen.instanciaScreen();
		s.setVisible(true);

		try {
			int inicio = 0;
			int fin = 100;

			s.getBarra().setMinimum(inicio);
			s.getBarra().setMaximum(fin);
			s.getBarra().setStringPainted(true);
			
			for (int i = inicio; i <= fin; i+=20) {
				s.setValorBarra(i);
				Thread.sleep(1000);
			}
			Opciones vista = new Opciones();
			COpciones controlador = new COpciones(vista);
			vista.setVisible(true);
			s.setVisible(false);
		} catch (Exception e2) {
			System.out.println("Error " + e2.getMessage());
		} 
		
	}

}
