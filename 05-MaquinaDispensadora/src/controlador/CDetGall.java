package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

import modelo.Producto;
import vista.Comprar;
import vista.DetalleGalletas;
import vista.Opciones;

/**
 * Controlador para la vista DetalleGalletas
 * @author cesar
 * @version 1.0
 *
 */
public class CDetGall implements ActionListener, WindowListener {
	
	private DetalleGalletas vista = new DetalleGalletas();
	private Producto modelo = new Producto();
	
	/**
	 * Constructor del controlador
	 * @param vista Vista de tipo DetalleGalletas
	 * @param modelo Modelo de tipo Producto
	 */
	public CDetGall(DetalleGalletas vista, Producto modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
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
		COpciones cont = new COpciones(op);
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
			
			if(e.getSource() == vista.getBtnComprar()) {
				
				chlSelec = vista.getArrJck();
				lbText = vista.getArrTexts();
				lbIcons = vista.getArrIcons();
				lbPrices = vista.getArrPrices();
				
				Object [][] productos = new Object [11][4];
				
				for (int i = 0; i <= chlSelec.length-1; i++) {
					if(chlSelec[i].isSelected()) {
						modelo.setNombre(chlSelec[i].getText());
						modelo.setDescripcion(lbText[i].getText());
						modelo.setIcono(lbIcons[i].getIcon().toString());
						modelo.setPrecio(Integer.parseInt(lbPrices[i].getText()));
						productos[i][0] = modelo.getNombre();
						productos[i][1] = modelo.getDescripcion();
						productos[i][2] = modelo.getIcono();
						productos[i][3] = modelo.getPrecio();
					}
				}
				
				Comprar comprar = new Comprar(productos);
				CComprar cont = new CComprar(comprar);
				comprar.setVisible(true);
				vista.setVisible(false);
			}
		} catch (Exception e2) {
			vista.mostrarError(String.format("Ha ocurrido un error de tipo: %s", e2.getMessage()));
		}
	}
}
