package modelo;

/**
 * 
 * @author cesar
 *
 */
public class Operaciones {
	private double n1 = 0.0;
	private double n2 = 0.0;
	private double resultado = 0.0;
	
	/**
	 * Constructor por defecto
	 */
	public Operaciones() {}
	
	/**
	 * Constructor de los numeros
	 * @param n1 Numero 1 para las operaciones
	 * @param n2 Numero 2 para las operaciones
	 */
	public Operaciones(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/**
	 * 
	 * @return Retorna el numero uno en formato double
	 */
	public double getN1() {
		return n1;
	}
	
	/**
	 * Establece el valor del numero uno
	 * @param n1 Numero uno para las operaciones en formato double
	 */
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	/**
	 * 
	 * @return Retorna el numero dos en formato double
	 */
	public double getN2() {
		return n2;
	}
	
	/**
	 * Establece el valor del numero dos
	 * @param n2 Numero dos para las operaciones en formato double
	 */
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	/**
	 * 
	 * @return Retorna el resultado de la operacion
	 */
	public double getResultado() {
		return resultado;
	}
	
	/**
	 * Establece el resultado de la operacion
	 * @param resultado
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	/**
	 * Metodo para calcular la suma de dos numeros
	 * @param n1 Numero uno en formato double
	 * @param n2 Numero dos en formato double
	 * @return Retorna el resultado de la operacion en formato double
	 */
	public double suma(double n1, double n2){
		return resultado = n1 + n2;
	}
	
	/**
	 * Metodo para calcular la resta de dos numeros
	 * @param n1 Numero uno en formato double
	 * @param n2 Numero dos en formato double
	 * @return Retorna el resultado de la operacion en formato double
	 */
	public double resta(double n1, double n2){
		return resultado = n1 - n2;
	}
	
	/**
	 * Metodo para calcular la multiplicacion de dos numeros
	 * @param n1 Numero uno en formato double
	 * @param n2 Numero dos en formato double
	 * @return Retorna el resultado de la operacion en formato double
	 */
	public double multiplicacion(double n1, double n2){
		return resultado = n1 * n2;
	}
	
	/**
	 * Metodo para calcular la division de dos numeros
	 * @param n1 Numero uno en formato double
	 * @param n2 Numero dos en formato double
	 * @return Retorna el resultado de la operacion en formato double
	 */
	public double division(double n1, double n2){
		return resultado = n1 / n2;
	}
	
	/**
	 * Metodo para detectar numeros dobles y enteros
	 * @param numero Numero a detectar en formato double
	 * @return Retorna una cadena de texto con el numero
	 */
	public String detectaDoble(double numero){
		return numero % 1.0 != 0 ? String.format("%s", numero) : String.format("%.0f", numero);
	}
}
