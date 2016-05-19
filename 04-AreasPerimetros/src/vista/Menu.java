package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu extends JFrame{
	
	private JButton btnArea = new JButton("Areas");
	private JButton btnPerimetro = new JButton("Perímetros");
	private JLabel lbMensaje = new JLabel("Bienvenido, escoge una opción:");
	
	private Container c = getContentPane();

	public Menu() {
		super.setSize(320, 320);
		super.setTitle("Menú");
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
	}
	
	private void cargarControles(){
		c.setLayout(null);
		
		lbMensaje.setBounds(10, 10, 300, 30);
		btnArea.setBounds(10, 50, 300, 100);
		btnPerimetro.setBounds(10, 165, 300, 100);
		
		c.add(lbMensaje);
		c.add(btnArea);
		c.add(btnPerimetro);
	}
	
	public void onClickBtnArea(ActionListener al){
		btnArea.addActionListener(al);
	}
	
	public void onClickBtnPerimetro(ActionListener al){
		btnPerimetro.addActionListener(al);
	}
	
	public JButton getBtnArea() {
		return btnArea;
	}

	public JButton getBtnPerimetro() {
		return btnPerimetro;
	}
	
	public void mostrarError(String error){
		JOptionPane.showMessageDialog(this, error, "Error!", JOptionPane.ERROR_MESSAGE);
	}
	
}
