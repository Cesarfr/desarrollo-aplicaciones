package singleton;

public final class Singleton {
	/**
	 * Instancia de la clase de tipo static, final
	 */
	private static Singleton s = null;
	private volatile String texto = null;
	private int precio = 0;
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	@Override
	public String toString(){
		return "Singleton[texto="+texto+",precio="+precio;
	}
	
	/**
	 * Constructor de la clase de tipo private
	 */
	private Singleton() {
		System.out.println("Objeto 1");
		precio++;
	}
	
	/**
	 * Método para retornar la instancia Singleton
	 * @return Objeto de tipo Singleton
	 */
	public static Singleton instanciaSingleton() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	
	public void clean() {
		s = null;
		precio--;
	}
}
