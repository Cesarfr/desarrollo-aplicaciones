package modelo;

public class Triangulo {
	
	private double base = 0.0;
	private double altura = 0.0;
	private double lado1 = 0.0;
	private double lado2 = 0.0;
	private double lado3 = 0.0;
	private double resultado = 0.0;
	
	public Triangulo(){}
	
	public Triangulo(double base, double altura) {
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
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
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
