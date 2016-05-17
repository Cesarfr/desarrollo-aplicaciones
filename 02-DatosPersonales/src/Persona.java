/**
 * 
 * @author cesar
 *
 */
public class Persona {
	private String nombre;
	private String telefono;
	private int edad;
	private String color;
	private String sexo;
	private String correo;
	private String direccion;
	private int cp;
	private String pelicula;
	private String musica;
	
	/**
	 * 
	 * @param nombre nombre de la persona en formato String
	 * @param telefono telefono de la persona en formato String
	 * @param edad edad de la persona en formato int
	 */
	public Persona(String nombre, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	/**
	 * 
	 * @param nombre Nombre de la persona en formato String
	 * @param telefono Telefono de la persona en formato String
	 * @param edad Edad de la en formato int
	 * @param color Color favorito de la persona
	 * @param sexo Sexo de la persona
	 * @param correo Correo electronico de la persona
	 * @param direccion Dirección de la persona
	 * @param cp Código postal de la persona
	 * @param pelicula Pelicula favorita de la persona
	 * @param musica Música favorita de la persona
	 */
	public Persona(String nombre, String telefono, int edad, String color,
			String sexo, String correo, String direccion, int cp,
			String pelicula, String musica) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		this.color = color;
		this.sexo = sexo;
		this.correo = correo;
		this.direccion = direccion;
		this.cp = cp;
		this.pelicula = pelicula;
		this.musica = musica;
	}

	/**
	 * 
	 * @return Retorna el nombre de la persona en String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre EStablece el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return retorna el telefono de la persona en formato String
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * 
	 * @param telefono Establece el telefono de la persona en formato String
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * 
	 * @return retorna la edad en formato int
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad Establece la edad en formato int
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * 
	 * @return Retorna el color en formato String
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * 
	 * @param color Establece el color en formato String
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 * @return retorna el sexo en formato String
	 */
	public String getSexo() {
		return sexo;
	}
	
	/**
	 * 
	 * @param sexo Establece el sexo en formato String
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * 
	 * @return Retorna el correo en formato String
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * 
	 * @param correo Establece el correo en formato String
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	 * 
	 * @return Retorna la direccion en formato String
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * 
	 *@param direccion Establece la direccion en formato String
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * 
	 * @return Retorna el codigo postal en formato int
	 */
	public int getCp() {
		return cp;
	}
	
	/**
	 * 
	 * @param cp Establece el codigo posta el formato int 
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	/**
	 * 
	 * @return Retorna la pelicula en formato String
	 */
	public String getPelicula() {
		return pelicula;
	}

	/**
	 * 
	 * @param pelicula Establece la pelicula en formato String
	 */
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	/**
	 * 
	 * @return Retorna la musica en formato String
	 */
	public String getMusica() {
		return musica;
	}
	
	/**
	 * 
	 * @param musica Establece la musica en formato String
	 */
	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	
}
