package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Circulo;
import vista.ACirculo;
import vista.OpcionesArea;

public class AreaCirculo implements ActionListener, WindowListener {
	
	private ACirculo vac = new ACirculo();
	private Circulo modelo = new Circulo();
	
	public AreaCirculo(ACirculo vac, Circulo modelo) {
		this.vac = vac;
		this.modelo = modelo;
		
		vac.onClickBtnCalcular(this);
		vac.eventoCerrar(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			double radio = 0.0;
			radio = vac.getRadio();
			
			if (e.getSource() == vac.getBtnCalcular()) {
				modelo.areaCirculo(radio);
				vac.setResultado(String.format("Área: %.5f u²", modelo.getResultado()));
			}
		} catch (NumberFormatException e2) {
			vac.mostrarError("Solo Numeros!");
			vac.limpiarCajas();
		}
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
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

}
