package modelo;

/**
 * Clase de las operaciones del cuadrado
 * @author cesar
 * @version 1.0
 *
 */
public class Cuadrado {
	
	private double lado = 0.0;
	private double resultado = 0.0;
	
	/**
	 * Constructor por defecto
	 */
	public Cuadrado(){}
	
	/**
	 * Costructor de la clase
	 * @param lado Lado del cuadrado en formato double
	 */
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	/**
	 * 
	 * @return Retorna el valor del resultado de la operacion
	 */
	public double getResultado() {
		return resultado;
	}
	
	/**
	 * Establece el valor del resultado de la operacion
	 * @param resultado Valor del resultado en formato double
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	/**
	 * 
	 * @return Retorna el valor del lado en formato double
	 */
	public double getLado() {
		return lado;
	}
	
	/**
	 * Establece el valor del lado en formato double
	 * @param lado
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	/**
	 * Operacion para sacar el area del cuadrado 
	 * @param lado Lado del cuadrado en formato double
	 * @return Retorna el valor del area en formato double
	 */
	public double areaCuadrado(double lado){
		return resultado = Math.pow(lado, 2);
	}
	
	/**
	 * OPeracion para sacar el perimetro del cuadrado
	 * @param lado Lado del cuadrado en formato double
	 * @return Retorna el valor del perimetro en formato double
	 */
	public double perimetroCuadrado(double lado){
		return resultado = lado * 4;
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
