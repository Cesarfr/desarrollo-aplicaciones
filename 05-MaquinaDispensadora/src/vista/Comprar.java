package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Vista para los productosuctos seleccionados
 * @author cesar
 * @version 1.0
 *
 */
public class Comprar extends JFrame {
	
	private JLabel[] lbIcono = new JLabel[10];
	private JLabel[] lbPrecio = new JLabel[10];
	private JLabel[] lbNombre = new JLabel[10];
	private JLabel[] lbTexto = new JLabel[10];
	
	private JLabel lbTotal = new JLabel("Total: $");
	private JLabel lbNTotal = new JLabel("");
	
	private JTextField txtMonto = new JTextField();
	private JButton btnPagar = new JButton("Pagar");
	private Container c = getContentPane();
	private Object [][] productos = new Object [11][4];
	
	/**
	 * Constructor por default de la vista
	 */
	public Comprar(){}
	
	/**
	 * Constructor de la vista Comprar
	 * @param productos Array de productos
	 */
	public Comprar(Object[][] productos) {
		this.productos = productos;
		super.setTitle("Comprar");
		super.setSize(320, 500);
		super.setResizable(false);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cargarControles();
	}
	
	/**
	 * Método par cargar los controles a la vista
	 */
	private void cargarControles(/*Object[][] productos*/) {
		c.setLayout(null);
		
		int y = 10;
		int y2 = 3;
		int y3 = 0;
		int total = 0;
		
		for(int i = 0; i<= productos.length-1; i++) {
			JLabel icono = new JLabel();
			JLabel nom = new JLabel();
			JLabel texto = new JLabel();
			JLabel precio = new JLabel();
			
			if(productos[i][0] != null) {
				
				String nombre = (String) productos[i][0];
				String descripcion = (String) productos[i][1];
				String ic = (String) productos[i][2];
				int pr = (int) productos[i][3];
				
				lbIcono[i] = icono;
				lbIcono[i].setBounds(10, y, 30, 30);
				lbIcono[i].setIcon(new ImageIcon(ic));
				
				if(descripcion.length() > 35) {
					lbPrecio[i] = precio;
					lbPrecio[i].setBounds(115, (y2-6), 50, 20);
					lbPrecio[i].setText(Integer.toString(pr));
				}else {
					lbPrecio[i] = precio;
					lbPrecio[i].setBounds(115, (y2+3), 50, 20);
					lbPrecio[i].setText(Integer.toString(pr));
				}
				
				lbTexto[i] = texto;
				lbTexto[i].setBounds(50, y3, 250, 40);
				lbTexto[i].setText(descripcion);
				
				lbNombre[i] = nom;
				lbNombre[i].setBounds(190, y3, 130, 20);
				lbNombre[i].setText(nombre);
				
				c.add(lbIcono[i]);
				c.add(lbPrecio[i]);
				c.add(lbTexto[i]);
				c.add(lbNombre[i]);
				
				total += pr;
				y += 50;
				y2 += 50;
				y3 += 50;
			}
			
		}
		
		lbTotal.setBounds(10, y3, 150, 30);
		lbNTotal.setBounds(180, y3, 150, 30);
		lbNTotal.setText(Integer.toString(total));
		y3 += 40;
		txtMonto.setBounds(10, y3, 300, 30);
		y3 += 40;
		btnPagar.setBounds(10, y3, 300, 40);
		c.add(lbTotal);
		c.add(lbNTotal);
		c.add(txtMonto);
		c.add(btnPagar);
		
		if(y3 > 460){
			super.setSize(320, 680);
		}
	}
	
	/**
	 * Método para obtener el valor del total de los productos
	 * @return Valor total en formato int
	 */
	public int getTotal(){
		return Integer.parseInt(lbNTotal.getText());
	}
	
	/**
	 * Método para obtener el valor del monto introducido por el usuario
	 * @return Monto en formato int
	 */
	public int getMonto() {
		return Integer.parseInt(txtMonto.getText());
	}
	
	/**
	 * Método para obtener el acceso al boton pagar
	 * @return Objeto de tipo JButton
	 */
	public JButton getBtnPagar() {
		return btnPagar;
	}

	/**
	 * ActionListener para el boton pagar
	 * @param al Objeto de tipo ActionListener
	 */
	public void onClickBtnComprar(ActionListener al) {
		btnPagar.addActionListener(al);
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
	
	/**
	 * Método para limpiar las cajas de texto de la aplicación
	 */
	public void limpiarCajas() {
		txtMonto.setText(null);
	}
}
