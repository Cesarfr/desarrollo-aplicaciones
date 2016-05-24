package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Rectangulo;
import vista.OpcionesPerimetro;
import vista.PRectangulo;

/**
 * Clase controladora de los eventos para el perimetro del rectangulo
 * @author cesar
 * @version 1.0
 *
 */
public class PerimetroRectangulo implements ActionListener, WindowListener {
	
	private PRectangulo vista = new PRectangulo();
	private Rectangulo modelo = new Rectangulo();
	
	/**
	 * Constructor de la clase controladora
	 * @param vista Vista para calcular el perimetro del rectangulo
	 * @param modelo Modelo de las operaciones
	 */
	public PerimetroRectangulo(PRectangulo vista, Rectangulo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickBtnCalcular(this);
		vista.eventoCerrar(this);
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
		OpcionesPerimetro opp = new OpcionesPerimetro();
		EventosOpcionesPerimetro controlador = new EventosOpcionesPerimetro(opp);
		opp.setVisible(true);		
	}

	/**
	 * Metodo par realizar acciones al cerrar la ventana
	 */
	@Override
	public void windowClosed(WindowEvent e) {
	}
	
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
			double base = 0.0;
			double altura = 0.0;
			String resultado = "";
			
			base = vista.getBase();
			altura = vista.getAltura();
			
			if(e.getSource() == vista.getBtnCalcular()) {
				if(base < 0 || altura < 0) {
					vista.mostrarError("Sólo números enteros!");
					vista.limpiarCajas();
				}else {
					modelo.perimetroRectangulo(base, altura);
					resultado = modelo.detectaDoble(modelo.getResultado());
					vista.setResultado(String.format("Perímetro: %s u", resultado));
				}
			}
		} catch (NumberFormatException e2) {
			vista.mostrarError("Solo Numeros!");
			vista.limpiarCajas();
		}
	}
	
}
