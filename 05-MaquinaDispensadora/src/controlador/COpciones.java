package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Producto;
import vista.Comprar;
import vista.DetalleChocolates;
import vista.DetalleDulces;
import vista.DetalleGalletas;
import vista.DetalleRefrescos;
import vista.Opciones;

/**
 * Controlador para la vista Opciones
 * @author cesar
 * @version 1.0
 *
 */
public class COpciones implements ActionListener, WindowListener{
	
	private Opciones vista = new Opciones();
	private Object [][] productos = new Object [11][4];
	
	/**
	 * Constructor de la clase COpciones
	 * @param vista Vista de tipo Opciones
	 */
	public COpciones(Opciones vista) {
		this.vista = vista;
		
		vista.onClickBtnChocolates(this);
		vista.onClickBtnDulces(this);
		vista.onClickBtnGalletas(this);
		vista.onClickBtnRefrescos(this);
		vista.onClickBtnPagar(this);
	}
	
	/**
	 * Constructor de la clase COpciones
	 * @param vista Vista de tipo Opciones
	 * @param productos Array de productos
	 */
	public COpciones(Opciones vista, Object [][] productos) {
		this.vista = vista;
		this.productos = productos;
		
		vista.onClickBtnChocolates(this);
		vista.onClickBtnDulces(this);
		vista.onClickBtnGalletas(this);
		vista.onClickBtnRefrescos(this);
		vista.onClickBtnPagar(this);
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
	public void windowClosing(WindowEvent e) {}
	
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
			if(e.getSource() == vista.getBtnChocolates()) {
				DetalleChocolates dtc = new DetalleChocolates();
				Producto modelo = new Producto();
				CDetChoco cont = new CDetChoco(dtc, modelo, productos);
				dtc.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnDulces()) {
				DetalleDulces dtd = new DetalleDulces();
				Producto modelo = new Producto();
				CDetDul cont = new CDetDul(dtd, modelo, productos);
				dtd.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnGalletas()) {
				DetalleGalletas dtg = new DetalleGalletas();
				Producto modelo = new Producto();
				CDetGall cont = new CDetGall(dtg, modelo, productos);
				dtg.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnRefrescos()) {
				DetalleRefrescos dtr = new DetalleRefrescos();
				Producto modelo = new Producto();
				CDetRef cont = new CDetRef(dtr, modelo, productos);
				dtr.setVisible(true);
				vista.setVisible(false);
			}else if(e.getSource() == vista.getBtnPagar()) {
//				System.out.println(productos.length);
				if(productos[0][0] == null) {
					vista.mostrarError("No hay productos!!");
				}else {
					Comprar comprar = new Comprar(productos);
					CComprar cont = new CComprar(comprar, productos);
					comprar.setVisible(true);
					vista.setVisible(false);
				}
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2));
		}
		
	}
	
}
