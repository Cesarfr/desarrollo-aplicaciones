package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Triangulo;
import vista.OpcionesPerimetro;
import vista.PTrianguloEquilatero;
import vista.PTrianguloEscaleno;
import vista.PTrianguloIsoceles;
import vista.TipoTriangulo;

/**
 * Clase controladora de eventos del menu de opciones tipo triángulo
 * @author cesar
 * @version 1.0
 */
public class EventosTipoTriangulo implements ActionListener, WindowListener {
	
	private TipoTriangulo vista = new TipoTriangulo();
	
	/**
	 * Costructor de la clase EventosTipoTriangulo
	 * @param vista Vista del menu de opciones de tipo triángulo
	 */
	public EventosTipoTriangulo(TipoTriangulo vista) {
		this.vista = vista;
		
		vista.onClickBtnSeleccionar(this);
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
			if(e.getSource() == vista.getBtnSelecciona()) {
				String opcion = "";
				opcion = vista.getTipo();
				switch(opcion){
					case "Equilatero":
						PTrianguloEquilatero vpte = new PTrianguloEquilatero();
						Triangulo mod = new Triangulo();
						PerimetroTrianguloEquilatero con = new PerimetroTrianguloEquilatero(vpte, mod);
						vpte.setVisible(true);
						vista.setVisible(false);
						break;
					case "Isoceles":
						PTrianguloIsoceles vpti = new PTrianguloIsoceles();
						Triangulo mod2 = new Triangulo();
						PerimetroTrianguloIsoceles con2 = new PerimetroTrianguloIsoceles(vpti, mod2);
						vpti.setVisible(true);
						vista.setVisible(false);
						break;
					case "Escaleno":
						PTrianguloEscaleno pat = new PTrianguloEscaleno();
						Triangulo modelo = new Triangulo();
						PerimetroTrianguloEscaleno controlador = new PerimetroTrianguloEscaleno(pat, modelo);
						pat.setVisible(true);
						vista.setVisible(false);
						break;
					default:
						break;
				}
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}		
		
	}

}
