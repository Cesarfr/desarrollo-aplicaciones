package cliente.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para establecer la conexion a la base de datos (Singleton)
 * @author cesar
 * @version 1.0
 *
 */
public final class ConexionBD {

	private static final ConexionBD c = new ConexionBD();
	private Connection micon = null;
	
	/**
	 * Constructor por default de la clase
	 */
	private ConexionBD() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método para obtener la instancia de la clase
	 * @return Objeto Singleton de tipo ConexionBD
	 */
	public static ConexionBD getConexion() {
		return c;
	}
	
	/**
	 * Método para establecer la conexion a la base de datos
	 * @return Objeto de tipo Connection
	 */
	public Connection getConnSQLite() {
		try {
			if(micon == null) {
				micon = DriverManager.getConnection("jdbc:sqlite:db/mensaje.db");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return micon;
	}

}
