package cliente.app;

import cliente.modelo.Usuario;
import cliente.controlador.CInicio;
import cliente.vista.VInicio;

/**
 * Clase principal del cliente
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
