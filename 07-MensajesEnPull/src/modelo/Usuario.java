package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
	
//	private final static Usuario usr = new Usuario();
	
	private int id = 0;
	private String nombre = null;
	private String apPat = null;
	private String apMat = null;
	private String user = null;
	private String passwd = null;
	
	private PreparedStatement pstmt = null;
	private ResultSet rs =null;
	
	public Usuario() {}
	
//	public Usuario getUserInstance() {
//		return usr;
//	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPat() {
		return apPat;
	}

	public void setApPat(String apPat) {
		this.apPat = apPat;
	}

	public String getApMat() {
		return apMat;
	}

	public void setApMat(String apMat) {
		this.apMat = apMat;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public int guardaUsuario(Connection conn, String nombre, String apPat, String apMat, String user, String passwd) {

		int ok = 0;
		try {
			String sqli = "INSERT INTO usuario (nombre, apPat, apMat, user, passwd) VALUES(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sqli);
			pstmt.setString(1, nombre);
			pstmt.setString(2, apPat);
			pstmt.setString(3, apMat);
			pstmt.setString(4, user);
			pstmt.setString(5, passwd);
			pstmt.executeUpdate();
			ok = 1;
		} catch (SQLException e) {
			e.printStackTrace();
			ok = 0;
		}
		return ok;
	}
	
	public ResultSet regresaUsuario(Connection conn, String user, String passwd) {
		try {
			String sql = "SELECT id, nombre, apPat, apMat FROM usuario WHERE user=? AND passwd=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
}
