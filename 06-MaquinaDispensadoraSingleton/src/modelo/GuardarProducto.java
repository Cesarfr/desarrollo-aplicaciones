package modelo;

import java.util.ArrayList;
/**
 * Clase Singleton para guardar los productos
 * @author cesar
 *
 */
public final class GuardarProducto {
	
	private static final GuardarProducto gp = new GuardarProducto();
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	private GuardarProducto() {
		System.out.println("GuardarProducto creado");
	}
	
	/**
	 * Método para retornar la instancia Producto
	 * @return Instancia de tipo Producto
	 */
	public static GuardarProducto instanciaGP() {
		return gp;
	}
	
	/**
	 * Método para obtener la lista de productos
	 * @return ArrayList con los productos
	 */
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	/**
	 * Método para establecer la lista de productos
	 * @param productos ArrayList de productos
	 */
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	/**
	 * Método para agregar un producto a la lista 
	 * @param prod Producto a agregar a la lista
	 */
	public void addProducto(Producto prod) {
		productos.add(prod);
	}
	
	/**
	 * Método para limpiar la lista de productos
	 */
	public void limpiarProductos(){
		productos.clear();
	}
}
