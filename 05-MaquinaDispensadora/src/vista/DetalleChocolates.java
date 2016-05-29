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
 * Vista para los detalles de los chocolates
 * @author cesar
 * @version 1.0
 *
 */
public class DetalleChocolates extends JFrame {
	
	private JLabel lbIconoCrunch = new JLabel();
	private JLabel lbPrecioCrunch = new JLabel("15");
	private JLabel lbTextoCrunch = new JLabel("<html>Precio: $<br>Chocolate con leche y arroz inflado</html>");
	private JCheckBox chkCrunch = new JCheckBox("Crunch");
	
	private JLabel lbIconoFerrero = new JLabel();
	private JLabel lbPrecioFerrero = new JLabel("35");
	private JLabel lbTextoFerrero = new JLabel("<html>Precio: $<br>Chocolate premium con nueces</html>");
	private JCheckBox chkFerrero = new JCheckBox("Ferrero");
	
	private JLabel lbIconoHersheys = new JLabel();
	private JLabel lbPrecioHersheys = new JLabel("20");
	private JLabel lbTextoHersheys = new JLabel("<html>Precio: $<br>Chocolate con leche y vitaminas</html>");
	private JCheckBox chkHersheys = new JCheckBox("Hersheys");
	
	private JLabel lbIconoKisses = new JLabel();
	private JLabel lbPrecioKisses = new JLabel("20");
	private JLabel lbTextoKisses = new JLabel("<html>Precio: $<br>Chocolate en forma de gotas para regalar</html>");
	private JCheckBox chkKisses = new JCheckBox("Kisses");
	
	private JLabel lbIconoKitkat = new JLabel();
	private JLabel lbPrecioKitkat = new JLabel("15");
	private JLabel lbTextoKitkat = new JLabel("<html>Precio: $<br>Chocolate con leche</html>");
	private JCheckBox chkKitkat = new JCheckBox("Kitkat");
	
	private JLabel lbIconoMilka = new JLabel();
	private JLabel lbPrecioMilka = new JLabel("12");
	private JLabel lbTextoMilka = new JLabel("<html>Precio: $<br>Chocolate en barra con nueces</html>");
	private JCheckBox chkMilka = new JCheckBox("Milka");
	
	private JLabel lbIconoMilkyway = new JLabel();
	private JLabel lbPrecioMilkyway = new JLabel("14");
	private JLabel lbTextoMilkyway = new JLabel("<html>Precio: $<br>Barra de chocolate con relleno</html>");
	private JCheckBox chkMilkyway = new JCheckBox("Milkyway");
	
	private JLabel lbIconoMm = new JLabel();
	private JLabel lbPrecioMm = new JLabel("10");
	private JLabel lbTextoMm = new JLabel("<html>Precio: $<br>Chocolate en lunetas de colores</html>");
	private JCheckBox chkMm = new JCheckBox("M&Ms");
	
	private JLabel lbIconoSnickers = new JLabel();
	private JLabel lbPrecioSnickers = new JLabel("16");
	private JLabel lbTextoSnickers = new JLabel("<html>Precio: $<br>Barra de chocolate con relleno de cajeta</html>");
	private JCheckBox chkSnickers = new JCheckBox("Snickers");
	
	private JLabel lbIconoToblerone = new JLabel();
	private JLabel lbPrecioToblerone = new JLabel("25");
	private JLabel lbTextoToblerone = new JLabel("<html>Precio: $<br>Mega barra de chocolate cremosito</html>");
	private JCheckBox chkToblerone = new JCheckBox("Toblerone");
	
	private JButton btnComprar = new JButton("Comprar");
	private Container c = getContentPane();
	
	private JLabel[] arrPrices = { lbPrecioCrunch, lbPrecioFerrero,
			lbPrecioHersheys, lbPrecioKisses, lbPrecioKitkat, lbPrecioMilka,
			lbPrecioMilkyway, lbPrecioMm, lbPrecioSnickers, lbPrecioToblerone };

	private JLabel[] arrTexts = { lbTextoCrunch, lbTextoFerrero,
			lbTextoHersheys, lbTextoKisses, lbTextoKitkat, lbTextoMilka,
			lbTextoMilkyway, lbTextoMm, lbTextoSnickers, lbTextoToblerone };

	private JLabel[] arrIcons = { lbIconoCrunch, lbIconoFerrero,
			lbIconoHersheys, lbIconoKisses, lbIconoKitkat, lbIconoMilka,
			lbIconoMilkyway, lbIconoMm, lbIconoSnickers, lbIconoToblerone };

	private JCheckBox[] arrJck = { chkCrunch, chkFerrero, chkHersheys,
			chkKisses, chkKitkat, chkMilka, chkMilkyway, chkMm, chkSnickers,
			chkToblerone };
	
	/**
	 * Constructor de la vista DetalleChocolates
	 */
	public DetalleChocolates() {
		super.setTitle("Detalle Chocolates");
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
		
		lbIconoCrunch.setBounds(10, 10, 30, 30);
		lbIconoCrunch.setIcon(new ImageIcon("images/chocolates/crunch.jpg"));
		lbPrecioCrunch.setBounds(115, 3, 50, 30);
		lbTextoCrunch.setBounds(50, 0, 250, 50);
		chkCrunch.setBounds(190, 0, 130, 20);
		
		lbIconoFerrero.setBounds(10, 60, 30, 30);
		lbIconoFerrero.setIcon(new ImageIcon("images/chocolates/ferrero.jpg"));
		lbPrecioFerrero.setBounds(115, 53, 50, 30);
		lbTextoFerrero.setBounds(50, 50, 250, 50);
		chkFerrero.setBounds(190, 50, 130, 20);
		
		lbIconoHersheys.setBounds(10, 110, 30, 30);
		lbIconoHersheys.setIcon(new ImageIcon("images/chocolates/hersheys.jpg"));
		lbPrecioHersheys.setBounds(115, 103, 50, 30);
		lbTextoHersheys.setBounds(50, 100, 250, 50);
		chkHersheys.setBounds(190, 100, 130, 20);
		
		lbIconoKisses.setBounds(10, 160, 30, 30);
		lbIconoKisses.setIcon(new ImageIcon("images/chocolates/kisses.jpg"));
		lbPrecioKisses.setBounds(115, 150, 50, 30);
		lbTextoKisses.setBounds(50, 150, 250, 50);
		chkKisses.setBounds(190, 150, 130, 20);
		
		lbIconoKitkat.setBounds(10, 210, 30, 30);
		lbIconoKitkat.setIcon(new ImageIcon("images/chocolates/kitkat.jpg"));
		lbPrecioKitkat.setBounds(115, 203, 50, 30);
		lbTextoKitkat.setBounds(50, 200, 250, 50);
		chkKitkat.setBounds(190, 200, 130, 20);
		
		lbIconoMilka.setBounds(10, 260, 30, 30);
		lbIconoMilka.setIcon(new ImageIcon("images/chocolates/milka.jpg"));
		lbPrecioMilka.setBounds(115, 253, 50, 30);
		lbTextoMilka.setBounds(50, 250, 250, 50);
		chkMilka.setBounds(190, 250, 130, 20);
		
		lbIconoMilkyway.setBounds(10, 310, 30, 30);
		lbIconoMilkyway.setIcon(new ImageIcon("images/chocolates/milkyway.jpg"));
		lbPrecioMilkyway.setBounds(115, 303, 50, 30);
		lbTextoMilkyway.setBounds(50, 300, 250, 50);
		chkMilkyway.setBounds(190, 300, 130, 20);
		
		lbIconoMm.setBounds(10, 360, 30, 30);
		lbIconoMm.setIcon(new ImageIcon("images/chocolates/mm.png"));
		lbPrecioMm.setBounds(115, 353, 50, 30);
		lbTextoMm.setBounds(50, 350, 250, 50);
		chkMm.setBounds(190, 350, 130, 20);
		
		lbIconoSnickers.setBounds(10, 410, 30, 30);
		lbIconoSnickers.setIcon(new ImageIcon("images/chocolates/snickers.jpg"));
		lbPrecioSnickers.setBounds(115, 400, 50, 30);
		lbTextoSnickers.setBounds(50, 400, 250, 50);
		chkSnickers.setBounds(190, 400, 130, 20);
		
		lbIconoToblerone.setBounds(10, 460, 30, 30);
		lbIconoToblerone.setIcon(new ImageIcon("images/chocolates/toblerone.jpg"));
		lbPrecioToblerone.setBounds(115, 450, 50, 30);
		lbTextoToblerone.setBounds(50, 450, 250, 50);
		chkToblerone.setBounds(190, 450, 130, 20);
		
		btnComprar.setBounds(10, 510, 300, 40);
		
		c.add(lbIconoCrunch);
		c.add(lbPrecioCrunch);
		c.add(lbTextoCrunch);
		c.add(chkCrunch);
		
		c.add(lbIconoFerrero);
		c.add(lbPrecioFerrero);
		c.add(lbTextoFerrero);
		c.add(chkFerrero);
		
		c.add(lbIconoHersheys);
		c.add(lbPrecioHersheys);
		c.add(lbTextoHersheys);
		c.add(chkHersheys);
		
		c.add(lbIconoKisses);
		c.add(lbPrecioKisses);
		c.add(lbTextoKisses);
		c.add(chkKisses);
		
		c.add(lbIconoKitkat);
		c.add(lbPrecioKitkat);
		c.add(lbTextoKitkat);
		c.add(chkKitkat);
		
		c.add(lbIconoMilka);
		c.add(lbPrecioMilka);
		c.add(lbTextoMilka);
		c.add(chkMilka);
		
		c.add(lbIconoMilkyway);
		c.add(lbPrecioMilkyway);
		c.add(lbTextoMilkyway);
		c.add(chkMilkyway);
		
		c.add(lbIconoMm);
		c.add(lbPrecioMm);
		c.add(lbTextoMm);
		c.add(chkMm);
		
		c.add(lbIconoSnickers);
		c.add(lbPrecioSnickers);
		c.add(lbTextoSnickers);
		c.add(chkSnickers);
		
		c.add(lbIconoToblerone);
		c.add(lbPrecioToblerone);
		c.add(lbTextoToblerone);
		c.add(chkToblerone);
		
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
