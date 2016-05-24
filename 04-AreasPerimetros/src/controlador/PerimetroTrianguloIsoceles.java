package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Triangulo;
import vista.OpcionesPerimetro;
import vista.PTrianguloIsoceles;

/**
 * Clase controladora de eventos del PerimetroTrianguloIsoceles
 * @author cesar
 * @version 1.0
 */
public class PerimetroTrianguloIsoceles implements ActionListener, WindowListener {
	
	private PTrianguloIsoceles vista = new PTrianguloIsoceles();
	private Triangulo modelo = new Triangulo();
	
	/**
	 * Constructor de la clase PerimetroTrianguloIsoceles
	 * @param vista Vista para el perímetro del triángulo isoceles
	 * @param modelo Modelo de tipo Triangulo
	 */
	public PerimetroTrianguloIsoceles(PTrianguloIsoceles vista, Triangulo modelo) {
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
			double lado1 = 0.0;
			double lado2 = 0.0;
			String resultado = "";
			lado1 = vista.getLado1();
			lado2 = vista.getLado2();
			
			if(e.getSource() == vista.getBtnCalcular()) {
				if(lado1 < 0.0) {
					vista.mostrarError("Sólo números positivos!");
					vista.limpiarCajas();
				}else if(lado2 < 0.0) {
					vista.mostrarError("Sólo números positivos!");
					vista.limpiarCajas();
				}else {
					modelo.perimetroTrianguloIsoceles(lado1, lado2);
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
