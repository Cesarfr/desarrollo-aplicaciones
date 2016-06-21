package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Modelo para los Mensajes
 * @author cesar
 * @version 1.0
 *
 */
public class Mensaje {

	private String mensaje = null;
	private String fecha = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private ArrayList<String> arrMens = new ArrayList<String>();
	
	/**
	 * Constructor por defecto de la clase
	 */
	public Mensaje() {}
	
	/**
	 * Constructor parametrizado de la clase
	 * @param mensaje Mensaje en formato String
	 * @param fecha Fecha del mensaje en formato String
	 */
	public Mensaje(String mensaje, String fecha) {
		this.mensaje = mensaje;
		this.fecha = fecha;
	}
	
	/**
	 * Método para obtener el contenido del mensaje
	 * @return Mensaje en formato String
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * Método para establecer el contenido del mensaje
	 * @param mensaje Mensaje en formato String
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	/**
	 * Método para obtener el valor de la fecha
	 * @return Fecha en formato String
	 */
	public String getFecha() {
		return fecha;
	}
	
	/**
	 * Método para establecer el valor de la fecha
	 * @param fecha Fecha en formato String
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Método para obtener todos los mensajes guardados
	 * @param conn Conexion a la base de datos
	 * @return ArrayList con todos los mensajes
	 */
	public ArrayList<String> getMensajes(Connection conn) {
		try {
			String sql = "SELECT fechaHora, mensaje, nombre, apPat, apMat FROM mensaje "
					+ "INNER JOIN usuario ON mensaje.idUsuario=usuario.id";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				arrMens.add(String.format("%2$s \n %3$s %4$s %5$s,\n %1$s \n\n", rs.getString(1),
						rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrMens;
	}
	
	/**
	 * Método para guardar un mensaje
	 * @param conn Conexion a la base de datos
	 * @param mensaje Mensaje en formato String
	 * @param id ID del usuario en formato int
	 * @param fecha Fecha del mensaje en formato String
	 * @return Variable de control en formato int
	 */
	public int guardarMensaje(Connection conn, String mensaje, int id, String fecha) {
		int ok = 0;
		try {
			String sqli = "INSERT INTO mensaje (idUsuario, fechaHora, mensaje) VALUES(?,?,?)";
			pstmt = conn.prepareStatement(sqli);
			pstmt.setInt(1, id);
			pstmt.setString(2, fecha);
			pstmt.setString(3, mensaje);
			pstmt.executeUpdate();
			ok = 1;
		} catch (SQLException e) {
			ok = 0;
		}
		return ok;
	}
	
}
