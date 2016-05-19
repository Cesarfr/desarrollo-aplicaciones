package modelo;

/**
 * Clase para las operaciones del triangulo
 * @author cesar
 * @version 1.0
 *
 */
public class Triangulo {
	
	private double base = 0.0;
	private double altura = 0.0;
	private double lado1 = 0.0;
	private double lado2 = 0.0;
	private double lado3 = 0.0;
	private double resultado = 0.0;
	
	/**
	 * Costructor por defecto de la clase
	 */
	public Triangulo(){}
	
	/**
	 * Cosntructor de la clase
	 * @param base Base del triangulo en formato double
	 * @param altura Altura del triangulo en formato double
	 */
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * Retorna el valor de la base del triangulo en formato double
	 * @return Retorna el valor de la base del triangulo en formato double
	 */
	public double getBase() {
		return base;
	}
	
	/**
	 * Establece el valor de la base del triangulo
	 * @param base Base del triangulo en formato double
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
	 * Retorna el valor del lado 1 del triangulo
	 * @return Retorna el valor del lado 1 del triangulo
	 */
	public double getLado1() {
		return lado1;
	}
	
	/**
	 * Establece el valor del lado 1 del triangulo
	 * @param lado1 Lado 1 del triangulo en formato double
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	/**
	 * Retorna el valor del lado 2 del triangulo
	 * @return Retorna el valor del lado 2 del triangulo
	 */
	public double getLado2() {
		return lado2;
	}
	
	/**
	 * Establece el valor del lado 2 del triangulo
	 * @param lado2 Lado 2 del triangulo en formato double
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	/**
	 * Retorna el valor del lado 3 del triangulo
	 * @return Retorna el valor del lado 3 del triangulo
	 */
	public double getLado3() {
		return lado3;
	}
	
	/**
	 * Establece el valor del lado 3 del triangulo
	 * @param lado3
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	/**
	 * Establece el valor de la altura del triangulo
	 * @param altura Altura del triangulo en formato double
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
	 * Operacion para calcular el area del triangulo
	 * @param base Base del triangulo en formato double
	 * @param altura Altura del triangulo en formato double
	 * @return Retorna el area del triangulo
	 */
	public double areaTriangulo(double base, double altura){
		return resultado = (base * altura)/2;
	}
	
	/**
	 * Operacion para calcular el perimetro del triangulo
	 * @param base Base del triangulo en formato double
	 * @param altura Altura del triangulo en formato double
	 * @return Retorna el perimetro del triangulo
	 */
	public double perimetroTriangulo(double lado1, double lado2, double lado3){
		return resultado = lado1 + lado2 + lado3;
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
