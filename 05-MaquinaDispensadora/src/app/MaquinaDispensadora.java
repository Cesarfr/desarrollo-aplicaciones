package app;

import javax.swing.SwingUtilities;

import controlador.CScreen;
import vista.Screen;

public class MaquinaDispensadora {

	public static void main(String[] args) {
		Screen s = new Screen();
		CScreen con = new CScreen(s);
		s.setVisible(true);

		Thread espera = new Thread();
		try {
			int inicio = 0;
			int fin = 100;

			s.getBarra().setMinimum(inicio);
			s.getBarra().setMaximum(fin);
			s.getBarra().setStringPainted(true);
			
			for (int i = inicio; i <= fin; i+=20) {
				s.setValorBarra(i);
				espera.sleep(1000);
			}
		} catch (Exception e2) {
			System.out.println("Error " + e2.getMessage());
		}
		
	}

}
