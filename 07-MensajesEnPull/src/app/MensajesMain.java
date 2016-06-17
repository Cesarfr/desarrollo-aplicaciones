package app;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import modelo.Usuario;
import controlador.CInicio;
import vista.VAgregarMensaje;
import vista.VInicio;

public class MensajesMain {

	public static void main(String[] args) {
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = new Date();
//		System.out.println(dateFormat.format(date));
		
		VInicio v = new VInicio();
		Usuario u = new Usuario();
		CInicio c = new CInicio(v, u);
//		VAgregarMensaje v = new VAgregarMensaje();
		v.setVisible(true);
	}

}
