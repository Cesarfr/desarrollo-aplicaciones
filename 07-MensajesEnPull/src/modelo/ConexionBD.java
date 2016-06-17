package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexionBD {

	private static final ConexionBD c = new ConexionBD();
	private Connection micon = null;

	private ConexionBD() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static ConexionBD getConexion() {
		return c;
	}

	public Connection getConnSQLite() {
		try {
			if(micon == null) {
				micon = DriverManager.getConnection("jdbc:sqlite:sources/mensajes.db");
				System.out.println("Conexion creada");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return micon;
	}

}
