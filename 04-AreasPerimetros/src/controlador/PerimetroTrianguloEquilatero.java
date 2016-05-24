package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Triangulo;
import vista.OpcionesPerimetro;
import vista.PTrianguloEquilatero;

/**
 * Clase controladora para el perímetro del triángulo equilatero
 * @author cesar
 * @version 1.0
 *
 */
public class PerimetroTrianguloEquilatero implements ActionListener, WindowListener {
	
	private PTrianguloEquilatero vista = new PTrianguloEquilatero();
	private Triangulo modelo = new Triangulo();
	
	/**
	 * Constructor de la clase PerimetroTrianguloEquilatero
	 * @param vista Vista para calcular el perímetro del triángulo equilatero
	 * @param modelo
	 */
	public PerimetroTrianguloEquilatero(PTrianguloEquilatero vista,
			Triangulo modelo) {
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
			double lado = 0.0;
			lado = vista.getLado();
			String resultado = "";
			
			if(e.getSource() == vista.getBtnCalcular()) {
				if(lado < 0) {
					vista.mostrarError("Sólo números positivos!");
					vista.limpiarCajas();
				}else {
					modelo.perimetroTrianguloEquilatero(lado);
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
