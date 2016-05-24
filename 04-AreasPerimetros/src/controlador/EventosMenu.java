package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Menu;
import vista.OpcionesArea;
import vista.OpcionesPerimetro;

/**
 * Clase controladora de los eventos del menu pricipal
 * @author cesar
 * @version 1.0
 */
public class EventosMenu implements ActionListener{
	
	private Menu vista = new Menu();
	
	/**
	 * Constructor de la clase controladora
	 * @param vista Vista del menu principal
	 */
	public EventosMenu(Menu vista){
		this.vista = vista;
		
		vista.onClickBtnArea(this);
		vista.onClickBtnPerimetro(this);
	}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			if (e.getSource() == vista.getBtnArea()) {
				OpcionesArea opa = new OpcionesArea();
				EventosOpcionesArea controlador = new EventosOpcionesArea(opa);
				opa.setVisible(true);
				vista.setVisible(false);
			} else if (e.getSource() == vista.getBtnPerimetro()) {
				OpcionesPerimetro opp = new OpcionesPerimetro();
				EventosOpcionesPerimetro controlador = new EventosOpcionesPerimetro(opp);
				opp.setVisible(true);
				vista.setVisible(false);
			}
		} catch (Exception e2) {
			vista.mostrarError(e2.getMessage());
		}
		
	}
	
}
