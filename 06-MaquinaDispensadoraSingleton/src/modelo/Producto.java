package modelo;

/**
 * Modelo del producto (Singleton)
 * @author cesar
 * @version 1.0
 *
 */
public class Producto {
	
	private String nombre = "";
	private String descripcion = "";
	private String icono = "";
	private int precio = 0;
	
	/**
	 * Constructor por default de la clase
	 */
	public Producto() {}
	
	/**
	 * Constructor de la clase Producto
	 * @param nombre Nombre del producto en formato String
	 * @param descripcion Descripcion del producto en formato String 
	 * @param precio Precio del producto en formato int
	 * @param icono Icono del producto en formato String
	 */
	public Producto(String nombre, String descripcion, int precio, String icono) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.icono = icono;
	}
	
	/**
	 * Método toString para devolver los cambios en los valores de la clase
	 */
	@Override
	public String toString(){
		return String.join(",", nombre, descripcion, icono, Integer.toString(precio));
	}
	
	/**
	 * Método para obtener el icono
	 * @return Icono en formato String
	 */
	public String getIcono() {
		return icono;
	}
	
	/**
	 * Método para asignar el icono
	 * @param icono Icono en formato String
	 */
	public void setIcono(String icono) {
		this.icono = icono;
	}
	
	/**
	 * Método para obtener la descripcion
	 * @return Descripcion en formato String
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Método para asignar la descripcion 
	 * @param descripcion Descripcion en formato String
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Método para obtener el nombre
	 * @return Nombre en formato String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método para asignar el nombre
	 * @param nombre Nombre en formato String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método para obtener el precio
	 * @return Precio en formato int
	 */
	public int getPrecio() {
		return precio;
	}
	
	/**
	 * Método para asignar el precio
	 * @param precio Precio en formato int
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
