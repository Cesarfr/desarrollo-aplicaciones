package modelo;

/**
 * Modelo para regresar el cambio
 * @author cesar
 * @version 1.0
 *
 */
public final class RegresaCambio {
	
	private static final RegresaCambio rc = new RegresaCambio();
	
	private int total = 0;
	private int [] monedas = {100, 50, 20, 10, 5, 1};
	private int [] cambio;
	
	/**
	 * Constructor por default de la clase
	 */
	private RegresaCambio() {
		System.out.println("RegresaCambio creado");
	}
	
	/**
	 * Constructor de la clase RegresaCambio
	 * @param total
	 */
	private RegresaCambio(int total) {
		this.total = total;
	}
	
	/**
	 * Método para retornar la instancia RegresaCambio
	 * @return Instancia de tipo RegresaCambio
	 */
	public static RegresaCambio instanciaRC() {
		return rc;
	}
	
	/**
	 * Método para obtener el total de la compra
	 * @return Total en formato int
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Método para asignar el total
	 * @param total Total en formato int
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	
	/**
	 * Método para asignar el cambio a devolver
	 * @return Cambio en formato array int
	 */
	public int[] getCambio() {
		return cambio;
	}
	
	/**
	 * Método para asignar el cambio a devolver 
	 * @param cambio Cambio en formato array int
	 */
	public void setCambio(int[] cambio) {
		this.cambio = cambio;
	}
	
	/**
	 * Método para obtener el tipo de monedas para el cambio
	 * @return Array de monedas
	 */
	public int[] getMonedas() {
		return monedas;
	}
	
	/**
	 * Método para asignar el tipo de monedas para el cambio
	 * @param monedas Array de monedas
	 */
	public void setMonedas(int[] monedas) {
		this.monedas = monedas;
	}
	
	/**
	 * Método para calcular el cambio usando el Algoritmo Voraz
	 * @param monto Monto de cambio en formato int
	 * @param valor Valor de las monedas en formato Array de enteros
	 * @return Array con el cambio
	 */
	public int[] calculaCambio(int monto, int[] valor) {
        cambio = new int[valor.length];
        for (int i = 0; i < valor.length; i++) {
            while (valor[i] <= monto) {
                cambio[i]++;
                monto = monto - valor[i];
            }
        }
        return cambio;
    }
}
