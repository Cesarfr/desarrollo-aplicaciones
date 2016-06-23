package servidor.modelo;

import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JTextArea;

/**
 * Clase servidor para el chat
 * @author cesar
 * @version 1.0
 *
 */
public class Servidor {

	private ServerSocket servsocket;
	private ArrayList<Socket> usuarios = new ArrayList<Socket>();
	
	/**
	 * Constructor de la clase
	 */
	public Servidor() {}
	
	/**
	 * Método para conectar el servidor
	 */
	public void conectarServer() {
		try {
			servsocket = new ServerSocket(5432);
			while (true) {
				try {
					System.out.println("Servidor->Esperando conexion\n");
					Socket socket = servsocket.accept();
					usuarios.add(socket);
					System.out.println("Se conectaron desde la IP: " + socket.getInetAddress() + "\n");
					Runnable runnable = new TareaServidor(socket, usuarios);
	                Thread hiloUser = new Thread(runnable);
	                hiloUser.start();
				} catch (EOFException excepcionEOF) {
					System.err.println("El Servidor termino la conexion");
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/**
	 * Método para cerrar la conexion del servidor
	 */
	public void cerrarServer(){
		try {
			servsocket.close();
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error al cerrar el servidor");
		}
	}
}
