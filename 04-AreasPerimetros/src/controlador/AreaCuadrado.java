package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Cuadrado;
import vista.ACuadrado;
import vista.OpcionesArea;

public class AreaCuadrado implements ActionListener, WindowListener{
	
	private ACuadrado vista = new ACuadrado();
	private Cuadrado modelo = new Cuadrado();
	
	public AreaCuadrado(ACuadrado vista, Cuadrado modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.onClickBtnCalcular(this);
		vista.eventoCerrar(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		OpcionesArea opa = new OpcionesArea();
		EventosOpcionesArea controlador = new EventosOpcionesArea(opa);
		opa.setVisible(true);		
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double lado = 0.0;
			lado = vista.getLado();
			
			if(e.getSource() == vista.getBtnCalcular()) {
				modelo.areaCuadrado(lado);
				vista.setResultado(String.format("Área: %.5f u²", modelo.getResultado()));
			}
		} catch (NumberFormatException e2) {
			vista.mostrarError("Solo numeros!");
			vista.limpiarCajas();
		}		
	}

}
