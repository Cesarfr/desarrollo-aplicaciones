package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Rectangulo;
import modelo.Triangulo;
import vista.Menu;
import vista.OpcionesPerimetro;
import vista.PCirculo;
import vista.PCuadrado;
import vista.PRectangulo;
import vista.PTrianguloEscaleno;
import vista.TipoTriangulo;

/**
 * Clase controladora de eventos del menu de opciones (perimetro)
 * @author cesar
 * @version 1.0
 */
public class EventosOpcionesPerimetro implements ActionListener, WindowListener {
	
	private OpcionesPerimetro vista = new OpcionesPerimetro();
	
	/**
	 * Cosntructor de la clase controladora
	 * @param vista Vista del menu de opciones
	 */
	public EventosOpcionesPerimetro(OpcionesPerimetro vista) {
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
				PCirculo pac = new PCirculo();
				Circulo modelo = new Circulo();
				PerimetroCirculo controlador = new PerimetroCirculo(pac, modelo);
				pac.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnCuadrado()) {
				PCuadrado pacu = new PCuadrado();
				Cuadrado modelo = new Cuadrado();
				PerimetroCuadrado controlador = new PerimetroCuadrado(pacu, modelo);
				pacu.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnRectangulo()) {
				PRectangulo par = new PRectangulo();
				Rectangulo modelo = new Rectangulo();
				PerimetroRectangulo controlador = new PerimetroRectangulo(par, modelo);
				par.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnTriangulo()) {
				TipoTriangulo tp = new TipoTriangulo();
				EventosTipoTriangulo evt = new EventosTipoTriangulo(tp);
				tp.setVisible(true);
				vista.setVisible(false);
			}
		} catch (Exception e2) {
			vista.muestraMensaje(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}		
	}

}
