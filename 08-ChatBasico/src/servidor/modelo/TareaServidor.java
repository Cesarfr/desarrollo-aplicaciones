package servidor.modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Clase que gestiona las conexiones de los clientes
 * @author cesar
 * @version 1.0
 *
 */
public class TareaServidor implements Runnable {

	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	private ArrayList<Socket> usuarios = new ArrayList<Socket>();
	
	/**
	 * Constructor de la clase
	 * @param socket Socket del cliente
	 * @param usuarios ArrayList de los usuarios conectados
	 */
	public TareaServidor(Socket socket, ArrayList<Socket> usuarios) {
		this.socket = socket;
		this.usuarios = usuarios;
	}
	
	/**
	 * Método para gestionar el flujo de datos
	 */
	@Override
	public void run() {
		try {

			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Bienvenido al Mensajito\n\n");

			while (true) {
				String recibido = dis.readUTF();

				for (int i = 0; i < usuarios.size(); i++) {
					dos = new DataOutputStream(usuarios.get(i)
							.getOutputStream());
					dos.writeUTF(recibido);
				}
			}
		} catch (IOException e) {
			for (int i = 0; i < usuarios.size(); i++) {
				if (usuarios.get(i) == socket) {
					usuarios.remove(i);
					break;
				}
			}
		}
	}
}
