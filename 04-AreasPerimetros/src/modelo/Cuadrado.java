package modelo;

public class Cuadrado {
	
	private double lado = 0.0;
	private double resultado = 0.0;
	
	public Cuadrado(){}

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double areaCuadrado(double lado){
		return resultado = Math.pow(lado, 2);
	}
	
	public double perimetroCuadrado(){
		return resultado = lado * 4;
	}
	
}
