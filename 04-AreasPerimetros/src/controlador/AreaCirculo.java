package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Circulo;
import vista.ACirculo;
import vista.OpcionesArea;
/**
 * Clase controladora para el area del circulo
 * @author cesar
 * @version 1.0
 *
 */
public class AreaCirculo implements ActionListener, WindowListener {
	
	private ACirculo vac = new ACirculo();
	private Circulo modelo = new Circulo();
	
	/**
	 * Constructor de la clase
	 * @param vac Vista para calcular el area del circulo
	 * @param modelo Modelo de las operaciones
	 */
	public AreaCirculo(ACirculo vac, Circulo modelo) {
		this.vac = vac;
		this.modelo = modelo;
		
		vac.onClickBtnCalcular(this);
		vac.eventoCerrar(this);
	}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			double radio = 0.0;
			String resultado = "";
			radio = vac.getRadio();
			
			if (e.getSource() == vac.getBtnCalcular()) {
				modelo.areaCirculo(radio);
				resultado = modelo.detectaDoble(modelo.getResultado());
				vac.setResultado(String.format("Área: %s u²", resultado));
			}
		} catch (NumberFormatException e2) {
			vac.mostrarError("Solo Numeros!");
			vac.limpiarCajas();
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
		OpcionesArea opa = new OpcionesArea();
		EventosOpcionesArea controlador = new EventosOpcionesArea(opa);
		opa.setVisible(true);
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

}
