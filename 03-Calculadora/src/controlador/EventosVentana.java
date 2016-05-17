package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operaciones;
import vista.Ventana;

/**
 * Clase para manejar los eventos de la aplicacion
 * @author cesar
 *
 */
public class EventosVentana implements ActionListener{
	private Ventana vista = new Ventana();
	private Operaciones modelo = new Operaciones();
	/**
	 * Constructor de la clase
	 * @param vista Vista de la aplicacion
	 * @param modelo Modelo de la aplicacion
	 */
	public EventosVentana(Ventana vista, Operaciones modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickSuma(this);
		vista.onClickResta(this);
		vista.onClickMultiplicacion(this);
		vista.onClickDivision(this);
	}
	
	/**
	 * Metodo para manejar las acciones segun el boton presionado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double n1 = 0.0;
			double n2 = 0.0;
			
			String nn1 = "";
			String nn2 = "";
			String resultado = "";
			
			n1 = vista.getN1();
			n2 = vista.getN2();
			
			if(e.getSource() == vista.getBtnSuma()){
				modelo.suma(n1, n2);
				
				nn1 = modelo.detectaDoble(n1);
				nn2 = modelo.detectaDoble(n2);
				
				resultado = modelo.detectaDoble(modelo.getResultado());
				
				if(n1 % n2 == 0){
					vista.setResultado(String.format("%s + %s = %s", nn1, nn2, resultado));
				}else{
					vista.setResultado(String.format("%s + %s = %s", nn1, nn2, resultado));
				}
				
			}else if(e.getSource() == vista.getBtnResta()){
				modelo.resta(n1, n2);
				nn1 = modelo.detectaDoble(n1);
				nn2 = modelo.detectaDoble(n2);
				
				resultado = modelo.detectaDoble(modelo.getResultado());
				
				if(n1 % n2 == 0){
					vista.setResultado(String.format("%s - %s = %s", nn1, nn2, resultado));
				}else{
					vista.setResultado(String.format("%s - %s = %s", nn1, nn2, resultado));
				}
			}else if(e.getSource() == vista.getBtnMultiplicacion()){
				modelo.multiplicacion(n1, n2);
				nn1 = modelo.detectaDoble(n1);
				nn2 = modelo.detectaDoble(n2);
				
				resultado = modelo.detectaDoble(modelo.getResultado());
				
				if(n1 % n2 == 0){
					vista.setResultado(String.format("%s x %s = %s", nn1, nn2, resultado));
				}else{
					vista.setResultado(String.format("%s x %s = %s", nn1, nn2, resultado));
				}
			}else if(e.getSource() == vista.getBtnDivision()){
				modelo.division(n1, n2);
				nn1 = modelo.detectaDoble(n1);
				nn2 = modelo.detectaDoble(n2);
				
				resultado = modelo.detectaDoble(modelo.getResultado());
				
				if(n1 % n2 == 0){
					vista.setResultado(String.format("%s \u00F7 %s = %s", nn1, nn2, resultado));
				}else{
					vista.setResultado(String.format("%s \u00F7 %s = %s", nn1, nn2, resultado));
				}
			}
		} catch (NumberFormatException e2) {
			vista.mostrarError("Sólo números");
			vista.limpiarCajas();
		}
		
	}
	
}
