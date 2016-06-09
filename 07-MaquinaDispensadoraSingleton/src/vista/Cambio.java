package vista;

import java.awt.Container;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Vista para el cambio
 * @author cesar
 * @version 1.0
 *
 */
public class Cambio extends JFrame{
	
	private JLabel lbCambio = new JLabel("Tu cambio:");
	private JLabel lbMensaje = new JLabel("<html><h2>Gracias por su preferencia !!</h2></html>");
	private JLabel lbCien = new JLabel("Cien");
	private JLabel lbCincuenta = new JLabel("Cincuenta");
	private JLabel lbVeinte = new JLabel("Veinte");
	private JLabel lbDiez = new JLabel("Diez");
	private JLabel lbCinco = new JLabel("Cinco");
	private JLabel lbPeso = new JLabel("Peso");
	
	private JLabel lbMCien = new JLabel("0 unidad(es)");
	private JLabel lbMCincuenta = new JLabel("0 unidad(es)");
	private JLabel lbMVeinte = new JLabel("0 unidad(es)");
	private JLabel lbMDiez = new JLabel("0 unidad(es)");
	private JLabel lbMCinco = new JLabel("0 unidad(es)");
	private JLabel lbMPeso = new JLabel("0 unidad(es)");
	
	private JLabel [] allLb = {lbMCien, lbMCincuenta, lbMVeinte, lbMDiez, lbMCinco, lbMPeso};
	private JButton btnOk = new JButton("OK");
	private Container c = getContentPane();
	
	/**
	 * Constructor de la vista Cambio
	 */
	public Cambio() {
		super.setTitle("Cambio");
		super.setSize(320, 480);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Método par cargar los controles a la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbCambio.setBounds(10, 10, 300, 30);
		
		lbCien.setBounds(10, 40, 200, 30);
		lbCincuenta.setBounds(10, 100, 200, 30);
		lbVeinte.setBounds(10, 160, 200, 30);
		lbDiez.setBounds(10, 220, 200, 30);
		lbCinco.setBounds(10, 280, 200, 30);
		lbPeso.setBounds(10, 340, 200, 30);
		
		lbMCien.setBounds(210, 40, 100, 30);
		lbMCincuenta.setBounds(210, 100, 100, 30);
		lbMVeinte.setBounds(210, 160, 100, 30);
		lbMDiez.setBounds(210, 220, 100, 30);
		lbMCinco.setBounds(210, 280, 100, 30);
		lbMPeso.setBounds(210, 340, 100, 30);
		
		lbMensaje.setBounds(10, 390, 300, 50);
		
		c.add(lbCambio);
		c.add(lbCien);
		c.add(lbCincuenta);
		c.add(lbVeinte);
		c.add(lbDiez);
		c.add(lbCinco);
		c.add(lbPeso);
		
		c.add(lbMCien);
		c.add(lbMCincuenta);
		c.add(lbMVeinte);
		c.add(lbMDiez);
		c.add(lbMCinco);
		c.add(lbMPeso);
		
		c.add(lbMensaje);
	}
	
	/**
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoVentana(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Método para obtener el array de los label para escibir el numero de piezas devueltas
	 * @return Array de tipo JLabel
	 */
	public JLabel[] getAllLb() {
		return allLb;
	}
	
	/**
	 * Método para mostrar el cambio devuelto
	 * @param cambio Mensaje de cambio en formato String
	 */
	public void setCambio(String cambio) {
		lbCambio.setText(cambio);
	}
	
}
