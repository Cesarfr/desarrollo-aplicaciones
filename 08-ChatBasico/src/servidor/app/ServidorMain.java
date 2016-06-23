package servidor.app;

import servidor.controlador.CServidor;
import servidor.modelo.Servidor;
import servidor.vista.VServidor;

/**
 * Clase principal para el servidor
 * @author cesar
 * @version 1.0
 *
 */
public class ServidorMain {
	
	/**
	 * Método main de la aplicacion
	 * @param args Argumentos del método
	 */
	public static void main(String[] args) {
		try {
			VServidor vista = new VServidor();
			Servidor modelo = new Servidor();
			CServidor controlador = new CServidor(vista, modelo);
			vista.setVisible(true);
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
