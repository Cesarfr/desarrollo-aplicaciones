/**
 * Clase del para probar el patrón singleton
 * @author cesar
 *
 */
public class TestSingleton {
	/**
	 * Método main de la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 = Singleton.instanciaSingleton();
		Singleton s2 = Singleton.instanciaSingleton();
		Singleton s3 = Singleton.instanciaSingleton();
		Singleton s4 = Singleton.instanciaSingleton();
		Singleton s5 = Singleton.instanciaSingleton();
	}

}
