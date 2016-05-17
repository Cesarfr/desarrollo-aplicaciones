import java.util.Scanner;

/**
 * @author cesar
 *
 */
public class Saludo {
	/**
	 * Método main de la clase Saludo 
	 * @param args
	 */
	public static void main(String[] args) {
		String nombre;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre?");
		nombre = teclado.nextLine();
		
//		System.out.println("Tu nombre es: " + nombre);
		System.out.printf("Hola %s", nombre);
	}

}
