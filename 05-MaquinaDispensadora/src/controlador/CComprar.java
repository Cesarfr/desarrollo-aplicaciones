package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Producto;
import modelo.RegresaCambio;
import vista.Cambio;
import vista.Comprar;
import vista.Opciones;

/**
 * Controlador para la vista Comprar
 * @author cesar
 * @version 1.0
 *
 */
public class CComprar implements ActionListener, WindowListener {
	
	private Comprar vista = new Comprar();
	
	/**
	 * Constructor del controlador
	 * @param vista Vista de tipo Comprar
	 */
	public CComprar(Comprar vista) {
		this.vista = vista;
		
		vista.onClickBtnComprar(this);
		vista.eventoVentana(this);
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
		Opciones op = new Opciones();
		COpciones cont = new COpciones(op);
		op.setVisible(true);
		vista.setVisible(false);
		vista.mostrarError("Venta cancelada!");
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
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int total = 0;
			if(e.getSource() == vista.getBtnPagar()) {
				if(vista.getMonto() < vista.getTotal()) {
					vista.mostrarError("El dinero introducido no es suficiente, introduce una cantidad no mayor a $100!");
				}else if(vista.getMonto() > 100){
					vista.mostrarError("No puedes ingresar mas de $100!");
				}else {
					total = vista.getMonto() - vista.getTotal();
					Cambio cm = new Cambio();
					RegresaCambio modelo = new RegresaCambio();
					CCambio control = new CCambio(cm, modelo, total);
					cm.setVisible(true);
					vista.setVisible(false);
				}
			}
		} catch (NumberFormatException e2) {
			vista.mostrarError("Solo numero enteros!");
			vista.limpiarCajas();
		}
	}
}
