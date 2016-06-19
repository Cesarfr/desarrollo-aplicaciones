package app;

import modelo.Usuario;
import controlador.CInicio;
import vista.VInicio;

/**
 * Clase principal de la aplicacion
 * @author cesar
 * @version 1.0
 *
 */
public class MensajesMain {
	
	/**
	 * Método main de la aplicacion
	 * @param args Argumentos del método
	 */
	public static void main(String[] args) {		
		VInicio v = new VInicio();
		Usuario u = new Usuario();
		CInicio c = new CInicio(v, u);
		v.setVisible(true);
	}

}
