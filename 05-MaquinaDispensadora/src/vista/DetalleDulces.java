package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Vista para los detalles de los dulces
 * @author cesar
 * @version 1.0
 *
 */
public class DetalleDulces extends JFrame {
	
	private JLabel lbIconoCupido = new JLabel();
	private JLabel lbPrecioCupido = new JLabel("5");
	private JLabel lbTextoCupido = new JLabel("<html>Precio: $<br>Paleta sabor fresa en forma de corazon</html>");
	private JCheckBox chkCupido = new JCheckBox("Paleta Cupido");

	private JLabel lbIconoDuvalin = new JLabel();
	private JLabel lbPrecioDuvalin = new JLabel("5");
	private JLabel lbTextoDuvalin = new JLabel("<html>Precio: $<br>Chocolate cremosito tricolor</html>");
	private JCheckBox chkDuvalin = new JCheckBox("Duvalin");

	private JLabel lbIconoHalls = new JLabel();
	private JLabel lbPrecioHalls = new JLabel("7");
	private JLabel lbTextoHalls = new JLabel("<html>Precio: $<br>Dulce para un aliento fresco</html>");
	private JCheckBox chkHalls = new JCheckBox("Halls");

	private JLabel lbIconoLucas = new JLabel();
	private JLabel lbPrecioLucas = new JLabel("6");
	private JLabel lbTextoLucas = new JLabel("<html>Precio: $<br>Dulce liquido picosito</html>");
	private JCheckBox chkLucas = new JCheckBox("Lucas");

	private JLabel lbIconoManita = new JLabel();
	private JLabel lbPrecioManita = new JLabel("4");
	private JLabel lbTextoManita = new JLabel("<html>Precio: $<br>Paleta sabor fresa en forma de mano</html>");
	private JCheckBox chkManita = new JCheckBox("Paleta Manita");

	private JLabel lbIconoMazapan = new JLabel();
	private JLabel lbPrecioMazapan = new JLabel("5");
	private JLabel lbTextoMazapan = new JLabel("<html>Precio: $<br>Dulce de cacahuate</html>");
	private JCheckBox chkMazapan = new JCheckBox("Mazapan");

	private JLabel lbIconoPelon = new JLabel();
	private JLabel lbPrecioPelon = new JLabel("8");
	private JLabel lbTextoPelon = new JLabel("<html>Precio: $<br>Dulce de tamarindo con chile</html>");
	private JCheckBox chkPelon = new JCheckBox("Pelon");

	private JLabel lbIconoPeriq = new JLabel();
	private JLabel lbPrecioPeriq = new JLabel("4");
	private JLabel lbTextoPeriq = new JLabel("<html>Precio: $<br>Dulce en polvo picosito</html>");
	private JCheckBox chkPeriq = new JCheckBox("Periquito");

	private JLabel lbIconoPulparindo = new JLabel();
	private JLabel lbPrecioPulparindo = new JLabel("3");
	private JLabel lbTextoPulparindo = new JLabel("<html>Precio: $<br>Tira de tamarindo dulce</html>");
	private JCheckBox chkPulparindo = new JCheckBox("Pulparindo");

	private JLabel lbIconoSandia = new JLabel();
	private JLabel lbPrecioSandia = new JLabel("4");
	private JLabel lbTextoSandia = new JLabel("<html>Precio: $<br>Paleta sabor sandia con cubierta de chile</html>");
	private JCheckBox chkSandia = new JCheckBox("Paleta sandia");
	
	private JButton btnComprar = new JButton("Comprar");
	
	private Container c = getContentPane();
	
	private JLabel[] arrPrices = { lbPrecioCupido, lbPrecioDuvalin,
			lbPrecioHalls, lbPrecioLucas, lbPrecioManita, lbPrecioMazapan,
			lbPrecioPelon, lbPrecioPeriq, lbPrecioPulparindo, lbPrecioSandia };

	private JLabel[] arrTexts = { lbTextoCupido, lbTextoDuvalin, lbTextoHalls,
			lbTextoLucas, lbTextoManita, lbTextoMazapan, lbTextoPelon,
			lbTextoPeriq, lbTextoPulparindo, lbTextoSandia };

	private JLabel[] arrIcons = { lbIconoCupido, lbIconoDuvalin, lbIconoHalls,
			lbIconoLucas, lbIconoManita, lbIconoMazapan, lbIconoPelon,
			lbIconoPeriq, lbIconoPulparindo, lbIconoSandia };

	private JCheckBox[] arrJck = { chkCupido, chkDuvalin, chkHalls, chkLucas,
			chkManita, chkMazapan, chkPelon, chkPeriq, chkPulparindo, chkSandia };
	
	/**
	 * Constructor de la vista DetalleDulces
	 */
	public DetalleDulces() {
		super.setTitle("Detalle Dulces");
		super.setSize(320, 580);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		cargarControles();
	}
	
	/**
	 * Método par cargar los controles a la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbIconoCupido.setBounds(10, 10, 30, 30);
		lbIconoCupido.setIcon(new ImageIcon("images/dulces/cupido.png"));
		lbPrecioCupido.setBounds(115, -4, 50, 30);
		lbTextoCupido.setBounds(50, 0, 250, 50);
		chkCupido.setBounds(190, 0, 130, 20);
		
		lbIconoDuvalin.setBounds(10, 60, 30, 30);
		lbIconoDuvalin.setIcon(new ImageIcon("images/dulces/duvalin.jpg"));
		lbPrecioDuvalin.setBounds(115, 53, 50, 30);
		lbTextoDuvalin.setBounds(50, 50, 250, 50);
		chkDuvalin.setBounds(190, 50, 130, 20);
		
		lbIconoHalls.setBounds(10, 110, 30, 30);
		lbIconoHalls.setIcon(new ImageIcon("images/dulces/halls.jpg"));
		lbPrecioHalls.setBounds(115, 103, 50, 30);
		lbTextoHalls.setBounds(50, 100, 250, 50);
		chkHalls.setBounds(190, 100, 130, 20);
		
		lbIconoLucas.setBounds(10, 160, 30, 30);
		lbIconoLucas.setIcon(new ImageIcon("images/dulces/lucas.jpg"));
		lbPrecioLucas.setBounds(115, 153, 50, 30);
		lbTextoLucas.setBounds(50, 150, 250, 50);
		chkLucas.setBounds(190, 150, 130, 20);
		
		lbIconoManita.setBounds(10, 210, 30, 30);
		lbIconoManita.setIcon(new ImageIcon("images/dulces/manita.png"));
		lbPrecioManita.setBounds(115, 196, 50, 30);
		lbTextoManita.setBounds(50, 200, 250, 50);
		chkManita.setBounds(190, 200, 130, 20);
		
		lbIconoMazapan.setBounds(10, 260, 30, 30);
		lbIconoMazapan.setIcon(new ImageIcon("images/dulces/mazapan.jpg"));
		lbPrecioMazapan.setBounds(115, 253, 50, 30);
		lbTextoMazapan.setBounds(50, 250, 250, 50);
		chkMazapan.setBounds(190, 250, 130, 20);
		
		lbIconoPelon.setBounds(10, 310, 30, 30);
		lbIconoPelon.setIcon(new ImageIcon("images/dulces/pelon.jpg"));
		lbPrecioPelon.setBounds(115, 303, 50, 30);
		lbTextoPelon.setBounds(50, 300, 250, 50);
		chkPelon.setBounds(190, 300, 130, 20);
		
		lbIconoPeriq.setBounds(10, 360, 30, 30);
		lbIconoPeriq.setIcon(new ImageIcon("images/dulces/polvito.jpg"));
		lbPrecioPeriq.setBounds(115, 353, 50, 30);
		lbTextoPeriq.setBounds(50, 350, 250, 50);
		chkPeriq.setBounds(190, 350, 130, 20);
		
		lbIconoPulparindo.setBounds(10, 410, 30, 30);
		lbIconoPulparindo.setIcon(new ImageIcon("images/dulces/pulparindo.jpg"));
		lbPrecioPulparindo.setBounds(115, 403, 50, 30);
		lbTextoPulparindo.setBounds(50, 400, 250, 50);
		chkPulparindo.setBounds(190, 400, 130, 20);
		
		lbIconoSandia.setBounds(10, 460, 30, 30);
		lbIconoSandia.setIcon(new ImageIcon("images/dulces/sandia.jpg"));
		lbPrecioSandia.setBounds(115, 446, 50, 30);
		lbTextoSandia.setBounds(50, 450, 250, 50);
		chkSandia.setBounds(190, 450, 130, 20);
		
		btnComprar.setBounds(10, 510, 300, 40);
		
		c.add(lbIconoCupido);
		c.add(lbPrecioCupido);
		c.add(lbTextoCupido);
		c.add(chkCupido);
		
		c.add(lbIconoDuvalin);
		c.add(lbPrecioDuvalin);
		c.add(lbTextoDuvalin);
		c.add(chkDuvalin);
		
		c.add(lbIconoHalls);
		c.add(lbPrecioHalls);
		c.add(lbTextoHalls);
		c.add(chkHalls);
		
		c.add(lbIconoLucas);
		c.add(lbPrecioLucas);
		c.add(lbTextoLucas);
		c.add(chkLucas);
		
		c.add(lbIconoManita);
		c.add(lbPrecioManita);
		c.add(lbTextoManita);
		c.add(chkManita);
		
		c.add(lbIconoMazapan);
		c.add(lbPrecioMazapan);
		c.add(lbTextoMazapan);
		c.add(chkMazapan);
		
		c.add(lbIconoPelon);
		c.add(lbPrecioPelon);
		c.add(lbTextoPelon);
		c.add(chkPelon);
		
		c.add(lbIconoPeriq);
		c.add(lbPrecioPeriq);
		c.add(lbTextoPeriq);
		c.add(chkPeriq);
		
		c.add(lbIconoPulparindo);
		c.add(lbPrecioPulparindo);
		c.add(lbTextoPulparindo);
		c.add(chkPulparindo);
		
		c.add(lbIconoSandia);
		c.add(lbPrecioSandia);
		c.add(lbTextoSandia);
		c.add(chkSandia);
		
		c.add(btnComprar);
	}
	
	/**
	 * Método para obtener el acceso al array de precios
	 * @return Array de tipo JLabel
	 */
	public JLabel[] getArrPrices() {
		return arrPrices;
	}
	
	/**
	 * Método para obtener el acceso al array de descripciones
	 * @return Array de tipo JLabel
	 */
	public JLabel[] getArrTexts() {
		return arrTexts;
	}
	
	/**
	 * Método para obtener el acceso al array de iconos
	 * @return Array de tipo JLabel
	 */
	public JLabel[] getArrIcons() {
		return arrIcons;
	}
	
	/**
	 * Método para obtener el acceso al array de checkboxes
	 * @return Array de tipo JCheckBox
	 */
	public JCheckBox[] getArrJck() {
		return arrJck;
	}
	
	/**
	 * Método para obtener el acceso al boton comprar
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnComprar() {
		return btnComprar;
	}
	
	/**
	 * ActionListener para el boton comprar
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnComprar(ActionListener al) {
		btnComprar.addActionListener(al);
	}
	
	/**
	 * WindowListener para la vista
	 * @param wl Objeto de tipo WindowListener
	 */
	public void eventoVentana(WindowListener wl) {
		this.addWindowListener(wl);
	}
	
	/**
	 * Método para mostrar una alerta de error
	 * @param error Error generado en formato String
	 */
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error !", JOptionPane.ERROR_MESSAGE);
	}
}
