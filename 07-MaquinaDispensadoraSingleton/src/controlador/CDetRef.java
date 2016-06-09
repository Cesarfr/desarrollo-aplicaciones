package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

import modelo.Producto;
import vista.Comprar;
import vista.DetalleRefrescos;
import vista.Opciones;

/**
 * Controlador para la vista DetalleRefrescos
 * @author cesar
 * @version 1.0
 *
 */
public class CDetRef implements ActionListener, WindowListener {
	
	private DetalleRefrescos vista = new DetalleRefrescos();
	private Producto modelo = Producto.instanciaProducto();
	private ArrayList<String> productos = new ArrayList<String>();
	
	/**
	 * Constructor del controlador
	 * @param vista Vista de tipo DetalleRefrescos
	 * @param modelo Modelo de tipo Producto
	 * @param productos ArrayList de productos
	 */
	public CDetRef(DetalleRefrescos vista, Producto modelo, ArrayList<String> productos) {
		this.vista = vista;
		this.modelo = modelo;
		this.productos = productos;
		
		vista.onClickBtnComprar(this);
		vista.eventoVentana(this);
	}
	
	/**
	 * Metodo para realizar acciones al abrir la ventana
	 */
	@Override
	public void windowOpened(WindowEvent e) {}
	
	/**
	 * Metodo para realizar acciones al intentar cerrar la ventana
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		Opciones op = new Opciones();
		COpciones cont = new COpciones(op, productos);
		op.setVisible(true);
		vista.setVisible(false);
	}
	
	/**
	 * Metodo par realizar acciones al cerrar la ventana
	 */
	@Override
	public void windowClosed(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al minimizar la ventana
	 */
	@Override
	public void windowIconified(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al maximizar la ventana
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al enfocar la ventana
	 */
	@Override
	public void windowActivated(WindowEvent e) {}
	
	/**
	 * Metodo par realizar acciones al desenfocar la ventana
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	/**
	 * Metodo manejador de las acciones de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			JCheckBox [] chlSelec = null;
			JLabel [] lbText = null;
			JLabel [] lbIcons = null;
			JLabel [] lbPrices = null;
			int total = 0;
			
			if(e.getSource() == vista.getBtnComprar()) {
				
				chlSelec = vista.getArrJck();
				lbText = vista.getArrTexts();
				lbIcons = vista.getArrIcons();
				lbPrices = vista.getArrPrices();
				
				
				for (int i = 0; i <= chlSelec.length-1; i++) {
					if(chlSelec[i].isSelected()) {
						modelo.setNombre(chlSelec[i].getText());
						modelo.setDescripcion(lbText[i].getText());
						modelo.setIcono(lbIcons[i].getIcon().toString());
						modelo.setPrecio(Integer.parseInt(lbPrices[i].getText()));
						productos.add(modelo.toString());
						total += modelo.getPrecio();
					}
				}
				if(total >= 100) {
					vista.mostrarError("Tu compra no puede ser mayor o igual a $100");
				}else if(total == 0){
					vista.mostrarError("Elige al menos un producto!!");
				}else {
					Comprar comprar = new Comprar(productos);
					CComprar cont = new CComprar(comprar, productos);
					comprar.setVisible(true);
					vista.setVisible(false);
				}
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
	}
	
}
