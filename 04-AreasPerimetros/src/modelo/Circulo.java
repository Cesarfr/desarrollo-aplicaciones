package modelo;

public class Circulo {
	
	private double radio = 0.0;
	private double diametro = 0.0;
	private double resultado = 0.0;
	
	public Circulo(){}

	public Circulo(double radio, double diametro) {
		this.radio = radio;
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double areaCirculo(double radio){
		return resultado = (Math.PI * Math.pow(radio, 2));
	}
	
	public double perimetroCirculo(double diametro){
		return resultado = (Math.PI * diametro);
	}
	
}
