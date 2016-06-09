package singleton;

public enum SEnum {
	s;
	private String texto = null;
		
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
