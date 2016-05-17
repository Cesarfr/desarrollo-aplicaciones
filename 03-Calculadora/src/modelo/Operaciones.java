package modelo;

public class Operaciones {
	private int n1 = 0;
	private int n2 = 0;
	private int resultado = 0;
	private double resultadoDos = 0.0;
	
	public Operaciones() {}

	public Operaciones(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public double getResultadoDos() {
		return resultadoDos;
	}

	public void setResultadoDos(double resultadodos) {
		this.resultadoDos = resultadodos;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int suma(int n1, int n2){
		return resultado = n1 + n2;
	}
	
	public int resta(int n1, int n2){
		return resultado = n1 - n2;
	}
	
	public int multiplicacion(int n1, int n2){
		return resultado = n1 * n2;
	}
	
	public int division(int n1, int n2){
		return resultado = n1 / n2;
	}
	
	public double divisionDouble(int n1, int n2){
		return resultadoDos = (double) n1 / (double) n2;
	}
}
