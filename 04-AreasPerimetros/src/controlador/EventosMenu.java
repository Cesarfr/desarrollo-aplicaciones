package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Menu;
import vista.OpcionesArea;
import vista.OpcionesPerimetro;

public class EventosMenu implements ActionListener{
	
	private Menu vista = new Menu();
	
	public EventosMenu(Menu vista){
		this.vista = vista;
		
		vista.onClickBtnArea(this);
		vista.onClickBtnPerimetro(this);
	}
	
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
				opp.setVisible(true);
			}
		} catch (Exception e2) {
			vista.mostrarError(e2.getMessage());
		}
		
	}
	
}
