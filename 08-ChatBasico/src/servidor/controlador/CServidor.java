package servidor.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import servidor.modelo.Servidor;
import servidor.vista.VServidor;

/**
 * Clase controladora del servidor
 * @author cesar
 * @version 1.0
 *
 */
public class CServidor implements ActionListener, WindowListener {
	
	private VServidor vista = new VServidor();
	private Servidor modelo = new Servidor();
	
	/**
	 * Constructor de la clase
	 * @param vista Objeto de tipo VServidor
	 * @param modelo Objeto de tipo Servidor
	 */
	public CServidor(VServidor vista, Servidor modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickBtnIniciar(this);
	}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == vista.getBtnIniciar()) {
		        vista.getBtnIniciar().setEnabled(false);
		        modelo.conectarServer();
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
	}

	/**
	 * Metodo para realizar acciones al abrir la ventana
	 */
	@Override
	public void windowOpened(WindowEvent e) {}
	
	/**
	 * Metodo para realizar acciones al intentar cerrar la ventana
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		
	}
	
	/**
	 * Metodo par realizar acciones al cerrar la ventana
	 */
	@Override
	public void windowClosed(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al minimizar la ventana
	 */
	@Override
	public void windowIconified(WindowEvent e) {}
	
	/**
	 * Método par realizar acciones al maximizar la ventana
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {}
	
	/**
	 * Método par realizar acciones al enfocar la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {}
	
	/**
	 * Método par realizar acciones al desenfocar la ventana
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}
