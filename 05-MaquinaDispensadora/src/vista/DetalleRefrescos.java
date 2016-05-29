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
 * Vista para los detalles de los refrescos
 * @author cesar
 * @version 1.0
 *
 */
public class DetalleRefrescos extends JFrame {
	
	private JLabel lbIcono7Up = new JLabel();
	private JLabel lbPrecio7Up = new JLabel("10");
	private JLabel lbTexto7Up = new JLabel("<html>Precio: $<br>Refresco sabor lima-limón</html>");
	private JCheckBox chk7Up = new JCheckBox("7Up");

	private JLabel lbIconoBigCola = new JLabel();
	private JLabel lbPrecioBigCola = new JLabel("8");
	private JLabel lbTextoBigCola = new JLabel("<html>Precio: $<br>Refresco sabor cola de alta calidad</html>");
	private JCheckBox chkBigCola = new JCheckBox("BigCola");

	private JLabel lbIconoCoca = new JLabel();
	private JLabel lbPrecioCoca = new JLabel("15");
	private JLabel lbTextoCoca = new JLabel("<html>Precio: $<br>Refresco sabor cola preferido por la mayoria</html>");
	private JCheckBox chkCoca = new JCheckBox("Coca-Cola");

	private JLabel lbIconoCrush = new JLabel();
	private JLabel lbPrecioCrush = new JLabel("8");
	private JLabel lbTextoCrush = new JLabel("<html>Precio: $<br>Refresco sabor piña lider en el mercado</html>");
	private JCheckBox chkCrush = new JCheckBox("Crush");

	private JLabel lbIconoFanta = new JLabel();
	private JLabel lbPrecioFanta = new JLabel("7");
	private JLabel lbTextoFanta = new JLabel("<html>Precio: $<br>Refresco sabor naranja preferido de los jovenes</html>");
	private JCheckBox chkFanta = new JCheckBox("Fanta");

	private JLabel lbIconoJarrito = new JLabel();
	private JLabel lbPrecioJarrito = new JLabel("8");
	private JLabel lbTextoJarrito = new JLabel("<html>Precio: $<br>Refresco sabor piña preferido de México</html>");
	private JCheckBox chkJarrito = new JCheckBox("Jarrito");

	private JLabel lbIconoManzanita = new JLabel();
	private JLabel lbPrecioManzanita = new JLabel("10");
	private JLabel lbTextoManzanita = new JLabel("<html>Precio: $<br>Refresco sabor manzana bajo en calorias</html>");
	private JCheckBox chkManzanita = new JCheckBox("Manzanita");

	private JLabel lbIconoPenafiel = new JLabel();
	private JLabel lbPrecioPenafiel = new JLabel("11");
	private JLabel lbTextoPenafiel = new JLabel("<html>Precio: $<br>Agua mineralizada con gas sabor naranja</html>");
	private JCheckBox chkPenafiel = new JCheckBox("Peñafiel");

	private JLabel lbIconoPepsi = new JLabel();
	private JLabel lbPrecioPepsi = new JLabel("13");
	private JLabel lbTextoPepsi = new JLabel("<html>Precio: $<br>Refresco sabor cola</html>");
	private JCheckBox chkPepsi = new JCheckBox("Pepsi");

	private JLabel lbIconoSquirt = new JLabel();
	private JLabel lbPrecioSquirt = new JLabel("10");
	private JLabel lbTextoSquirt = new JLabel("<html>Precio: $<br>Refresco sabor toronja para clmar la sed</html>");
	private JCheckBox chkSquirt = new JCheckBox("Squirt");
	
	private JButton btnComprar = new JButton("Comprar");
	
	private Container c = getContentPane();
	
	private JLabel[] arrPrices = { lbPrecio7Up, lbPrecioBigCola, lbPrecioCoca,
			lbPrecioCrush, lbPrecioFanta, lbPrecioJarrito, lbPrecioPenafiel,
			lbPrecioManzanita, lbPrecioPepsi, lbPrecioSquirt };

	private JLabel[] arrTexts = { lbTexto7Up, lbTextoBigCola, lbTextoCoca,
			lbTextoCrush, lbTextoFanta, lbTextoJarrito, lbTextoPenafiel,
			lbTextoManzanita, lbTextoPepsi, lbTextoSquirt };

	private JLabel[] arrIcons = { lbIcono7Up, lbIconoBigCola, lbIconoCoca,
			lbIconoCrush, lbIconoFanta, lbIconoJarrito, lbIconoPenafiel,
			lbIconoManzanita, lbIconoPepsi, lbIconoSquirt };

	private JCheckBox[] arrJck = { chk7Up, chkBigCola, chkCoca, chkCrush,
			chkFanta, chkJarrito, chkPenafiel, chkManzanita, chkPepsi,
			chkSquirt };
	
	/**
	 * Constructor de la vista Detallerefrescos
	 */
	public DetalleRefrescos() {
		super.setTitle("Detalle Refrescos");
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
		
		lbIcono7Up.setBounds(10, 10, 30, 30);
		lbIcono7Up.setIcon(new ImageIcon("images/refrescos/7up.jpg"));
		lbPrecio7Up.setBounds(115, 3, 50, 30);
		lbTexto7Up.setBounds(50, 0, 250, 50);
		chk7Up.setBounds(190, 0, 130, 20);
		
		lbIconoBigCola.setBounds(10, 60, 30, 30);
		lbIconoBigCola.setIcon(new ImageIcon("images/refrescos/bigcola.jpg"));
		lbPrecioBigCola.setBounds(115, 53, 50, 30);
		lbTextoBigCola.setBounds(50, 50, 250, 50);
		chkBigCola.setBounds(190, 50, 130, 20);
		
		lbIconoCoca.setBounds(10, 110, 30, 30);
		lbIconoCoca.setIcon(new ImageIcon("images/refrescos/coca.jpg"));
		lbPrecioCoca.setBounds(115, 100, 50, 30);
		lbTextoCoca.setBounds(50, 100, 250, 50);
		chkCoca.setBounds(190, 100, 130, 20);
		
		lbIconoCrush.setBounds(10, 160, 30, 30);
		lbIconoCrush.setIcon(new ImageIcon("images/refrescos/crushp.jpg"));
		lbPrecioCrush.setBounds(115, 150, 50, 30);
		lbTextoCrush.setBounds(50, 150, 250, 50);
		chkCrush.setBounds(190, 150, 130, 20);
		
		lbIconoFanta.setBounds(10, 210, 30, 30);
		lbIconoFanta.setIcon(new ImageIcon("images/refrescos/fanta.jpg"));
		lbPrecioFanta.setBounds(115, 200, 50, 30);
		lbTextoFanta.setBounds(50, 200, 250, 50);
		chkFanta.setBounds(190, 200, 130, 20);
		
		lbIconoJarrito.setBounds(10, 260, 30, 30);
		lbIconoJarrito.setIcon(new ImageIcon("images/refrescos/jarritop.jpg"));
		lbPrecioJarrito.setBounds(115, 250, 50, 30);
		lbTextoJarrito.setBounds(50, 250, 250, 50);
		chkJarrito.setBounds(190, 250, 130, 20);
		
		lbIconoPenafiel.setBounds(10, 310, 30, 30);
		lbIconoPenafiel.setIcon(new ImageIcon("images/refrescos/penafiel.jpg"));
		lbPrecioPenafiel.setBounds(115, 300, 50, 30);
		lbTextoPenafiel.setBounds(50, 300, 250, 50);
		chkPenafiel.setBounds(190, 300, 130, 20);
		
		lbIconoManzanita.setBounds(10, 360, 30, 30);
		lbIconoManzanita.setIcon(new ImageIcon("images/refrescos/manzanita.jpg"));
		lbPrecioManzanita.setBounds(115, 350, 50, 30);
		lbTextoManzanita.setBounds(50, 350, 250, 50);
		chkManzanita.setBounds(190, 350, 130, 20);
		
		lbIconoPepsi.setBounds(10, 410, 30, 30);
		lbIconoPepsi.setIcon(new ImageIcon("images/refrescos/pepsi.jpg"));
		lbPrecioPepsi.setBounds(115, 403, 50, 30);
		lbTextoPepsi.setBounds(50, 400, 250, 50);
		chkPepsi.setBounds(190, 400, 130, 20);
		
		lbIconoSquirt.setBounds(10, 460, 30, 30);
		lbIconoSquirt.setIcon(new ImageIcon("images/refrescos/squirt.jpg"));
		lbPrecioSquirt.setBounds(115, 450, 50, 30);
		lbTextoSquirt.setBounds(50, 450, 250, 50);
		chkSquirt.setBounds(190, 450, 130, 20);
		
		btnComprar.setBounds(10, 510, 300, 40);
		
		c.add(lbIcono7Up);
		c.add(lbPrecio7Up);
		c.add(lbTexto7Up);
		c.add(chk7Up);
		
		c.add(lbIconoBigCola);
		c.add(lbPrecioBigCola);
		c.add(lbTextoBigCola);
		c.add(chkBigCola);
		
		c.add(lbIconoCoca);
		c.add(lbPrecioCoca);
		c.add(lbTextoCoca);
		c.add(chkCoca);
		
		c.add(lbIconoCrush);
		c.add(lbPrecioCrush);
		c.add(lbTextoCrush);
		c.add(chkCrush);
		
		c.add(lbIconoFanta);
		c.add(lbPrecioFanta);
		c.add(lbTextoFanta);
		c.add(chkFanta);
		
		c.add(lbIconoJarrito);
		c.add(lbPrecioJarrito);
		c.add(lbTextoJarrito);
		c.add(chkJarrito);
		
		c.add(lbIconoPenafiel);
		c.add(lbPrecioPenafiel);
		c.add(lbTextoPenafiel);
		c.add(chkPenafiel);
		
		c.add(lbIconoManzanita);
		c.add(lbPrecioManzanita);
		c.add(lbTextoManzanita);
		c.add(chkManzanita);
		
		c.add(lbIconoPepsi);
		c.add(lbPrecioPepsi);
		c.add(lbTextoPepsi);
		c.add(chkPepsi);
		
		c.add(lbIconoSquirt);
		c.add(lbPrecioSquirt);
		c.add(lbTextoSquirt);
		c.add(chkSquirt);
		
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
