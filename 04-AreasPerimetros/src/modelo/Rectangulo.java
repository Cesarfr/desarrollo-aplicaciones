package modelo;

/**
 * Clase para las operaciones del rectangulo
 * @author cesar
 * @version 1.0
 *
 */
public class Rectangulo {
	
	private double base = 0.0;
	private double altura = 0.0;
	private double resultado = 0.0;
	
	/**
	 * Costructor por defecto de la clase
	 */
	public Rectangulo(){}
	
	/**
	 * Cosntructor de la clase
	 * @param base Base del rectangulo en formato double
	 * @param altura Altura del rectangulo en formato double
	 */
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * Retorna el valor de la base del rectangulo en formato double
	 * @return Retorna el valor de la base del rectangulo en formato double
	 */
	public double getBase() {
		return base;
	}
	
	/**
	 * Establece el valor de la base del rectangulo
	 * @param base Base del rectangulo en formato double
	 */
	public void setBase(double base) {
		this.base = base;
	}
	
	/**
	 * Retorna el valor de la altura en formato double
	 * @return Retorna el valor de la altura en formato double
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * Establece el valor de la altura del rectangulo
	 * @param altura Altura del rectangulo en formato double
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/**
	 * Retorna el valor del resultado en formato double
	 * @return Retorna el valor del resultado en formato double
	 */
	public double getResultado() {
		return resultado;
	}
	
	/**
	 * Establece el reultado de la operacion
	 * @param resultado Valor del resultado en formato double
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	/**
	 * Operacion para calcular el area del rectangulo
	 * @param base Base del rectangulo en formato double
	 * @param altura Altura del rectangulo en formato double
	 * @return Retorna el area del rectangulo
	 */
	public double areaRectangulo(double base, double altura){
		return resultado = (base * altura);
	}
	
	/**
	 * Operacion para calcular el perimetro del rectangulo
	 * @param base Base del rectangulo en formato double
	 * @param altura Altura del rectangulo en formato double
	 * @return Retorna el perimetro del rectangulo
	 */
	public double perimetroRectangulo(double base, double altura){
		return resultado = (2 * base) + (2 * altura);
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
