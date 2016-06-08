/**
 * Clase singleton de tipo final
 * @author cesar
 *
 */
public final class Singleton {
	/**
	 * Instancia de la clase de tipo static, final
	 */
	private static final Singleton s = new Singleton();
	
	/**
	 * Constructor de la clase de tipo private
	 */
	private Singleton() {
		System.out.println("Objeto 1");
	}
	
	/**
	 * Método para retornar la instancia Singleton
	 * @return Objeto de tipo Singleton
	 */
	public static Singleton instanciaSingleton() {
		return s;
	}
}
