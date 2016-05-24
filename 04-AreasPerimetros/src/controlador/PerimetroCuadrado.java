package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Cuadrado;
import vista.OpcionesPerimetro;
import vista.PCuadrado;

/**
 * Clase controladora de los eventos para el perimetro del cuadrado
 * @author cesar
 * @version 1.0
 */
public class PerimetroCuadrado implements ActionListener, WindowListener {

	private PCuadrado vista = new PCuadrado();
	private Cuadrado modelo = new Cuadrado();
	
	/**
	 * Constructor de la clase controladora
	 * @param vista Vista para calcular el perimetro del cuadrado
	 * @param modelo Modelo de las operaciones
	 */
	public PerimetroCuadrado(PCuadrado vista, Cuadrado modelo) {
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
			String resultado = "";
			
			lado = vista.getLado();
			
			if(e.getSource() == vista.getBtnCalcular()) {
				if(lado < 0) {
					vista.mostrarError("Sólo números enteros!");
					vista.limpiarCajas();
				}else {
					modelo.perimetroCuadrado(lado);
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
