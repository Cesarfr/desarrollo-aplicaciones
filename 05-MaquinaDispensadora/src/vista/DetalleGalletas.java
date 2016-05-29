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
 * Vista para los detalles de las galletas
 * @author cesar
 * @version 1.0
 *
 */
public class DetalleGalletas extends JFrame {
	
	private JLabel lbIconoArcoiris = new JLabel();
	private JLabel lbPrecioArcoiris = new JLabel("10");
	private JLabel lbTextoArcoiris = new JLabel("<html>Precio: $<br>Galleta con bombon y fresa</html>");
	private JCheckBox chkArcoiris = new JCheckBox("Arcoiris");

	private JLabel lbIconoChokis = new JLabel();
	private JLabel lbPrecioChokis = new JLabel("7");
	private JLabel lbTextoChokis = new JLabel("<html>Precio: $<br>Galleta con chispas de chocolate</html>");
	private JCheckBox chkChokis = new JCheckBox("Chokis");

	private JLabel lbIconoCrakets = new JLabel();
	private JLabel lbPrecioCrakets = new JLabel("6");
	private JLabel lbTextoCrakets = new JLabel("<html>Precio: $<br>Galleta salada para calmar el hambre</html>");
	private JCheckBox chkCrakets = new JCheckBox("Crakets");

	private JLabel lbIconoCremax = new JLabel();
	private JLabel lbPrecioCremax = new JLabel("9");
	private JLabel lbTextoCremax = new JLabel("<html>Precio: $<br>Galleta en forma de sandwich sabor vainilla</html>");
	private JCheckBox chkCremax = new JCheckBox("Cremax");

	private JLabel lbIconoFlorentinas = new JLabel();
	private JLabel lbPrecioFlorentinas = new JLabel("12");
	private JLabel lbTextoFlorentinas = new JLabel("<html>Precio: $<br>Galleta rellena de jalea sabor fresa</html>");
	private JCheckBox chkFlorentinas = new JCheckBox("Florentinas");

	private JLabel lbIconoFruts = new JLabel();
	private JLabel lbPrecioFruts = new JLabel("10");
	private JLabel lbTextoFruts = new JLabel("<html>Precio: $<br>Galleta fortificada sabor fresa</html>");
	private JCheckBox chkFruts = new JCheckBox("Fruts");

	private JLabel lbIconoMamut = new JLabel();
	private JLabel lbPrecioMamut = new JLabel("5");
	private JLabel lbTextoMamut = new JLabel("<html>Precio: $<br>Galleta en forma de sandwich con chocolate y bombon</html>");
	private JCheckBox chkMamut = new JCheckBox("Mamut");

	private JLabel lbIconoMarias = new JLabel();
	private JLabel lbPrecioMarias = new JLabel("8");
	private JLabel lbTextoMarias = new JLabel("<html>Precio: $<br>Galletas sabor vainilla fortificadas</html>");
	private JCheckBox chkMarias = new JCheckBox("Marias");

	private JLabel lbIconoOreo = new JLabel();
	private JLabel lbPrecioOreo = new JLabel("13");
	private JLabel lbTextoOreo = new JLabel("<html>Precio: $<br>Galletas de chocolate con cento cremosito</html>");
	private JCheckBox chkOreo = new JCheckBox("Oreo");

	private JLabel lbIconoQuaker = new JLabel();
	private JLabel lbPrecioQuaker = new JLabel("15");
	private JLabel lbTextoQuaker = new JLabel("<html>Precio: $<br>Galletas sabor manzana con avena</html>");
	private JCheckBox chkQuaker = new JCheckBox("Quaker");
	
	private JButton btnComprar = new JButton("Comprar");
	
	private Container c = getContentPane();
	
	private JLabel[] arrPrices = { lbPrecioArcoiris, lbPrecioChokis,
			lbPrecioCrakets, lbPrecioCremax, lbPrecioFlorentinas,
			lbPrecioFruts, lbPrecioMarias, lbPrecioMamut, lbPrecioOreo,
			lbPrecioQuaker };

	private JLabel[] arrTexts = { lbTextoArcoiris, lbTextoChokis,
			lbTextoCrakets, lbTextoCremax, lbTextoFlorentinas, lbTextoFruts,
			lbTextoMarias, lbTextoMamut, lbTextoOreo, lbTextoQuaker };

	private JLabel[] arrIcons = { lbIconoArcoiris, lbIconoChokis,
			lbIconoCrakets, lbIconoCremax, lbIconoFlorentinas, lbIconoFruts,
			lbIconoMarias, lbIconoMamut, lbIconoOreo, lbIconoQuaker };

	private JCheckBox[] arrJck = { chkArcoiris, chkChokis, chkCrakets,
			chkCremax, chkFlorentinas, chkFruts, chkMarias, chkMamut, chkOreo,
			chkQuaker };
	
	/**
	 * Constructor de la vista DetalleGalletas
	 */
	public DetalleGalletas() {
		super.setTitle("Detalle Galletas");
		super.setSize(320, 580);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);

		cargarControles();
	}
	
	/**
	 * Método par cargar los controles a la vista
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lbIconoArcoiris.setBounds(10, 10, 30, 30);
		lbIconoArcoiris.setIcon(new ImageIcon("images/galletas/arcoiris.jpg"));
		lbPrecioArcoiris.setBounds(115, 3, 50, 30);
		lbTextoArcoiris.setBounds(50, 0, 250, 50);
		chkArcoiris.setBounds(190, 0, 130, 20);
		
		lbIconoChokis.setBounds(10, 60, 30, 30);
		lbIconoChokis.setIcon(new ImageIcon("images/galletas/chokis.jpg"));
		lbPrecioChokis.setBounds(115, 53, 50, 30);
		lbTextoChokis.setBounds(50, 50, 250, 50);
		chkChokis.setBounds(190, 50, 130, 20);
		
		lbIconoCrakets.setBounds(10, 110, 30, 30);
		lbIconoCrakets.setIcon(new ImageIcon("images/galletas/crakets.jpg"));
		lbPrecioCrakets.setBounds(115, 100, 50, 30);
		lbTextoCrakets.setBounds(50, 100, 250, 50);
		chkCrakets.setBounds(190, 100, 130, 20);
		
		lbIconoCremax.setBounds(10, 160, 30, 30);
		lbIconoCremax.setIcon(new ImageIcon("images/galletas/cremax.jpg"));
		lbPrecioCremax.setBounds(115, 148, 50, 30);
		lbTextoCremax.setBounds(50, 150, 250, 50);
		chkCremax.setBounds(190, 150, 130, 20);
		
		lbIconoFlorentinas.setBounds(10, 210, 30, 30);
		lbIconoFlorentinas.setIcon(new ImageIcon("images/galletas/florentinas.jpg"));
		lbPrecioFlorentinas.setBounds(115, 198, 50, 30);
		lbTextoFlorentinas.setBounds(50, 200, 250, 50);
		chkFlorentinas.setBounds(190, 200, 130, 20);
		
		lbIconoFruts.setBounds(10, 260, 30, 30);
		lbIconoFruts.setIcon(new ImageIcon("images/galletas/fruts.jpg"));
		lbPrecioFruts.setBounds(115, 253, 50, 30);
		lbTextoFruts.setBounds(50, 250, 250, 50);
		chkFruts.setBounds(190, 250, 130, 20);
		
		lbIconoMarias.setBounds(10, 310, 30, 30);
		lbIconoMarias.setIcon(new ImageIcon("images/galletas/marias.jpg"));
		lbPrecioMarias.setBounds(115, 303, 50, 30);
		lbTextoMarias.setBounds(50, 300, 250, 50);
		chkMarias.setBounds(190, 300, 130, 20);
		
		lbIconoMamut.setBounds(10, 360, 30, 30);
		lbIconoMamut.setIcon(new ImageIcon("images/galletas/mamut.jpg"));
		lbPrecioMamut.setBounds(115, 350, 50, 30);
		lbTextoMamut.setBounds(50, 350, 250, 50);
		chkMamut.setBounds(190, 350, 130, 20);
		
		lbIconoOreo.setBounds(10, 410, 30, 30);
		lbIconoOreo.setIcon(new ImageIcon("images/galletas/oreo.jpg"));
		lbPrecioOreo.setBounds(115, 399, 50, 30);
		lbTextoOreo.setBounds(50, 400, 250, 50);
		chkOreo.setBounds(190, 400, 130, 20);
		
		lbIconoQuaker.setBounds(10, 460, 30, 30);
		lbIconoQuaker.setIcon(new ImageIcon("images/galletas/quacker.jpg"));
		lbPrecioQuaker.setBounds(115, 453, 50, 30);
		lbTextoQuaker.setBounds(50, 450, 250, 50);
		chkQuaker.setBounds(190, 450, 130, 20);
		
		btnComprar.setBounds(10, 510, 300, 40);
		
		c.add(lbIconoArcoiris);
		c.add(lbPrecioArcoiris);
		c.add(lbTextoArcoiris);
		c.add(chkArcoiris);
		
		c.add(lbIconoChokis);
		c.add(lbPrecioChokis);
		c.add(lbTextoChokis);
		c.add(chkChokis);
		
		c.add(lbIconoCrakets);
		c.add(lbPrecioCrakets);
		c.add(lbTextoCrakets);
		c.add(chkCrakets);
		
		c.add(lbIconoCremax);
		c.add(lbPrecioCremax);
		c.add(lbTextoCremax);
		c.add(chkCremax);
		
		c.add(lbIconoFlorentinas);
		c.add(lbPrecioFlorentinas);
		c.add(lbTextoFlorentinas);
		c.add(chkFlorentinas);
		
		c.add(lbIconoFruts);
		c.add(lbPrecioFruts);
		c.add(lbTextoFruts);
		c.add(chkFruts);
		
		c.add(lbIconoMarias);
		c.add(lbPrecioMarias);
		c.add(lbTextoMarias);
		c.add(chkMarias);
		
		c.add(lbIconoMamut);
		c.add(lbPrecioMamut);
		c.add(lbTextoMamut);
		c.add(chkMamut);
		
		c.add(lbIconoOreo);
		c.add(lbPrecioOreo);
		c.add(lbTextoOreo);
		c.add(chkOreo);
		
		c.add(lbIconoQuaker);
		c.add(lbPrecioQuaker);
		c.add(lbTextoQuaker);
		c.add(chkQuaker);
		
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
