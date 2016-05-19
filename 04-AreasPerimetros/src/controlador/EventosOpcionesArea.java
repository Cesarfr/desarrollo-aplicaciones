package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Rectangulo;
import modelo.Triangulo;
import vista.ACirculo;
import vista.ACuadrado;
import vista.ARectangulo;
import vista.ATriangulo;
import vista.Menu;
import vista.OpcionesArea;

/**
 * Clase controladora de los eventos del menu de opciones (area)
 * @author cesar
 * @version 1.0
 */
public class EventosOpcionesArea implements ActionListener, WindowListener {
	
	private OpcionesArea vista = new OpcionesArea();
	
	/**
	 * Constructor de la clase controladora
	 * @param vista Vista del menu de opciones
	 */
	public EventosOpcionesArea(OpcionesArea vista) {
		this.vista = vista;
		
		vista.onClickCirculo(this);
		vista.onClickCuadrado(this);
		vista.onClickRectangulo(this);
		vista.onClickTriangulo(this);
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
		Menu vistaMenu = new Menu();
		EventosMenu controlador = new EventosMenu(vistaMenu);
		vistaMenu.setVisible(true);
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
			if(e.getSource() == vista.getBtnCirculo()) {
				ACirculo vac = new ACirculo();
				Circulo modelo = new Circulo();
				AreaCirculo controlador = new AreaCirculo(vac, modelo);
				vac.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnCuadrado()) {
				ACuadrado vacu = new ACuadrado();
				Cuadrado modelo = new Cuadrado();
				AreaCuadrado controlador = new AreaCuadrado(vacu, modelo);
				vacu.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnRectangulo()) {
				ARectangulo var = new ARectangulo();
				Rectangulo modelo = new Rectangulo();
				AreaRectangulo controlador = new AreaRectangulo(var, modelo);
				var.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnTriangulo()) {
				ATriangulo vat = new ATriangulo();
				Triangulo modelo = new Triangulo();
				AreaTriangulo controlador = new AreaTriangulo(vat, modelo);
				vat.setVisible(true);
				vista.setVisible(false);
			}
		} catch (Exception e2) {
			vista.muestraMensaje(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
		
	}

}
