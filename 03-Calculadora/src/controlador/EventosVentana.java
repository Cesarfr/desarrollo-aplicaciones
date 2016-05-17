package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operaciones;
import vista.Ventana;

public class EventosVentana implements ActionListener{
	private Ventana vista = new Ventana();
	private Operaciones modelo = new Operaciones();
	
	public EventosVentana(Ventana vista, Operaciones modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickSuma(this);
		vista.onClickResta(this);
		vista.onClickMultiplicacion(this);
		vista.onClickDivision(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int n1 = 0;
			int n2 = 0;
			
			n1 = vista.getN1();
			n2 = vista.getN2();
			
			if(e.getSource() == vista.getBtnSuma()){
				
				modelo.suma(n1, n2);
				vista.setResultado(String.format("%d + %d = %d", n1, n2, modelo.getResultado()));
			}else if(e.getSource() == vista.getBtnResta()){
				modelo.resta(n1, n2);
				vista.setResultado(String.format("%d - %d = %d", n2, n2, modelo.getResultado()));
			}else if(e.getSource() == vista.getBtnMultiplicacion()){
				modelo.multiplicacion(n1, n2);
				vista.setResultado(String.format("%d x %d = %d", n1, n2, modelo.getResultado()));
			}else if(e.getSource() == vista.getBtnDivision()){
				if(n1 % n2 == 0){
					modelo.division(n1, n2);
					vista.setResultado(String.format("%d / %d = %d", n1, n2, modelo.getResultado()));
				}else{
					modelo.divisionDouble(n1, n2);
					vista.setResultado(String.format("%d / %d = %.3f", n1, n2, modelo.getResultadoDos()));
				}
			}
		} catch (NumberFormatException e2) {
			vista.mostrarError("Sólo números");
			vista.limpiarCajas();
		}
		
	}
	
}
