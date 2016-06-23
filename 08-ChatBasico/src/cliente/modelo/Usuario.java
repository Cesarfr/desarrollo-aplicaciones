package cliente.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Modelo para los usuarios
 * @author cesar
 * @version 1.0
 *
 */
public class Usuario {
	
	private int id = 0;
	private String nombre = null;
	private String apPat = null;
	private String apMat = null;
	private String email = null;
	private String passwd = null;
	
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	
	/**
	 * Cosntructor por default de la clase
	 */
	public Usuario() {}
	
	/**
	 * Método para obtener el ID del usuario
	 * @return ID en formato int
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Método para establecer el ID del usuario
	 * @param id ID en formato int
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Método para obtener el nombre del usuario
	 * @return Nombre del usuario en formato String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método para establecer el nombre del usuario
	 * @param nombre Nombre en formato String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el apellido paterno del usuario
	 * @return Apellido paterno en formato String
	 */
	public String getApPat() {
		return apPat;
	}
	
	/**
	 * Método para establecer el apellido paterno del usuario
	 * @param apPat Apellido paterno en formato String
	 */
	public void setApPat(String apPat) {
		this.apPat = apPat;
	}
	
	/**
	 * Método para obtener el apellido materno del usuario
	 * @return Apellido materno en formato String
	 */
	public String getApMat() {
		return apMat;
	}
	
	/**
	 * Método para establecer el apellido materno del usuario
	 * @param apMat Apellido materno en formato String
	 */
	public void setApMat(String apMat) {
		this.apMat = apMat;
	}
	
	/**
	 * Método para obtener el emailname del usuario
	 * @return emailname en formato String
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Método para establecer el email del usuario
	 * @param email email en formato String
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Método para obtener el password del usuario
	 * @return Password en formato String
	 */
	public String getPasswd() {
		return passwd;
	}
	
	/**
	 * Método para establecer el password del usuario
	 * @param passwd Password en formato String
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	/**
	 * Método para guardar un usuario en la base de datos
	 * @param conn Conexion a la base de datos
	 * @param nombre Nombre del usuario en formato String
	 * @param apPat Apellido paterno del usuario en formato String
	 * @param apMat Apellido materno del usuario en formato String
	 * @param email email en formato String
	 * @param passwd Password del ususario en formato String
	 * @return Variable de control en formato int
	 */
	public int guardaUsuario(Connection conn, String nombre, String apPat, String apMat, String email, String passwd) {

		int ok = 0;
		try {
			String sqli = "INSERT INTO usuario (nombre, apPat, apMat, email, passwd) VALUES(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sqli);
			pstmt.setString(1, nombre);
			pstmt.setString(2, apPat);
			pstmt.setString(3, apMat);
			pstmt.setString(4, email);
			pstmt.setString(5, passwd);
			pstmt.executeUpdate();
			ok = 1;
		} catch (SQLException e) {
			ok = 2;
		}
		return ok;
	}
	
	/**
	 * Método para buscar un usuario por emailname y password
	 * @param conn Conexion a la base de datos
	 * @param email emailname del usuario en formato String
	 * @param passwd Password del usuario en formato String
	 * @return Objeto de tipo ResultSet
	 */
	public ResultSet regresaUsuario(Connection conn, String email, String passwd) {
		try {
			String sql = "SELECT id, nombre, apPat, apMat FROM usuario WHERE email=? AND passwd=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			rs = null;
		}
		return rs;
	}
	
	/**
	 * Método para buscar un usuario mediante su ID
	 * @param conn Conexion a la base de datos
	 * @param id ID del usuario en formato int
	 * @return Objeto de tipo ResultSet
	 */
	public ResultSet regresaNomUsuario(Connection conn, int id) {
		try {
			String sql = "SELECT nombre, apPat, apMat FROM usuario WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			rs = null;
		}
		return rs;
	}
	
}
