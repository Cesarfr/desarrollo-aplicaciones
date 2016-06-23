package cliente.modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JTextArea;

/**
 * Clase para unir al usuario al servidor de mensajes
 * @author cesar
 * @version 1.0
 *
 */
public class Cliente implements Runnable{
	
	private Socket cliente;
    private DataInputStream dis;
    private DataOutputStream dos;
    private final int puerto = 5432;
    private final String host = "localhost";
    private String mensajes = "";
    private JTextArea taMensajes = new JTextArea();
    
    /**
     * Constructor de la clase
     * @param taMensajes TextArea donde se mostraran los mensajes
     */
    public Cliente(JTextArea taMensajes) {
    	this.taMensajes = taMensajes;
    	try {
            cliente = new Socket(host, puerto);
            dis = new DataInputStream(cliente.getInputStream());
            dos = new DataOutputStream(cliente.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
    
    /**
     * Método run para agregar los mensajes al textarea
     */
	@Override
	public void run() {
		try{
            while(true){
                mensajes = dis.readUTF();
                taMensajes.append(mensajes);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	
	/**
	 * Método para enviar el mensaje al servidor
	 * @param msg Mensaje a enviar en formato String
	 */
	public void enviarMensaje(String msg){
        try {
            dos.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
