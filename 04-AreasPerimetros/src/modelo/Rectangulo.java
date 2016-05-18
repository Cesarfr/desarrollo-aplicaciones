package modelo;

public class Rectangulo {
	
	private double base = 0.0;
	private double altura = 0.0;
	private double resultado = 0.0;
	
	public Rectangulo(){}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double areaTriangulo(double base, double altura){
		return resultado = (base * altura)/2;
	}
	
	public double perimetroTriangulo(double lado1, double lado2, double lado3){
		return resultado = lado1 + lado2 + lado3;
	}
	
}
