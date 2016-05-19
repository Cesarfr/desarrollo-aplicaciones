package modelo;

/**
 * Clase de las operaciones del circulo
 * @author cesar
 * @version 1.0
 *
 */
public class Circulo {
	
	private double radio = 0.0;
	private double diametro = 0.0;
	private double resultado = 0.0;
	
	/**
	 * Constructor por defecto 
	 */
	public Circulo(){}
	
	/**
	 * Constructor de la clase
	 * @param radio Radio del circulo en formato double
	 * @param diametro Diametro del circulo en formato double
	 */
	public Circulo(double radio, double diametro) {
		this.radio = radio;
		this.diametro = diametro;
	}
	
	/**
	 * 
	 * @return Retorna el Radio en formato double
	 */
	public double getRadio() {
		return radio;
	}
	
	/**
	 * Establece el valor del Radio
	 * @param radio Valor del raio en formato double
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	/**
	 * 
	 * @return Retorna el valor del diametro en formato double
	 */
	public double getDiametro() {
		return diametro;
	}
	
	/**
	 * Establece el valor del diametro
	 * @param diametro Valor del diametro en formato double
	 */
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	/**
	 * 
	 * @return Retorna el resultado en formato double
	 */
	public double getResultado() {
		return resultado;
	}
	
	/**
	 * Establece el valor del resultado
	 * @param resultado Valor del resultado en formato double
	 */
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	/**
	 * Operacion para calcular el area
	 * @param radio Valor del radio en formato double
	 * @return Retorna el resultado del area
	 */
	public double areaCirculo(double radio){
		return resultado = (Math.PI * Math.pow(radio, 2));
	}
	
	/**
	 * Operacion para calcular el perimetro 
	 * @param diametro Valor del diametro en formato double 
	 * @return Retorna el resultado del perimetro 
	 */
	public double perimetroCirculo(double diametro){
		return resultado = (Math.PI * diametro);
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
