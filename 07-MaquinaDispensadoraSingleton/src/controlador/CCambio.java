package controlador;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JLabel;

import modelo.Producto;
import modelo.RegresaCambio;
import vista.Cambio;
import vista.Opciones;

/**
 * Controlador para la vista Cambio
 * @author cesar
 * @version 1.0
 *
 */
public class CCambio implements WindowListener {
	
	private Cambio vista = new Cambio();
	private RegresaCambio modelo = RegresaCambio.instanciaRC();
	private int total = 0;
	
	/**
	 * Constructor del controlador
	 * @param vista Vista de tipo Cambio
	 * @param modelo Modelo de tipo RegresaCambio
	 * @param total Total del cambio a regresar en formato int
	 */
	public CCambio(Cambio vista, RegresaCambio modelo, int total) {
		this.vista = vista;
		this.modelo = modelo;
		this.total = total;
		
		vista.eventoVentana(this);
	}

	/**
	 * Metodo para realizar acciones al abrir la ventana
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		
		int [] monedas = modelo.getMonedas();
		int [] cambio = modelo.calculaCambio(total, monedas);
		if(total == 0) {
			vista.setCambio("Su compra no genera cambio!!");
		}else{
			vista.setCambio(String.format("Su cambio es: $%d", total));
		}
		JLabel[] allLb = vista.getAllLb();
		 
		for(int i = 0; i < cambio.length; i++){
			allLb[i].setText(String.format("%d unidad(es)", cambio[i]));
		}
	}
	
	/**
	 * Metodo para realizar acciones al intentar cerrar la ventana
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		Opciones op = new Opciones();
		ArrayList<String> productos = new ArrayList<String>();
		COpciones cont = new COpciones(op, productos);
		op.setVisible(true);
		vista.setVisible(false);
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
	 * Metodo par realizar acciones al maximizar la ventana
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al enfocar la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al desenfocar la ventana
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
