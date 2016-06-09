package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		ArrayList<SEnum> als = new ArrayList<SEnum>();
		
		HashMap<String,String> members = new HashMap<String,String>();
		
//		Singleton s1 = Singleton.instanciaSingleton();
//		s1.setTexto("HOla1");
//		System.out.println("Texto es: "+s1.getTexto());
//		Singleton s2 = Singleton.instanciaSingleton();
//		s2.setTexto("HOla2");
//		System.out.println("Texto es: "+s2.getTexto());
//		Singleton s3 = Singleton.instanciaSingleton();
//		s3.setTexto("HOla3");
//		System.out.println("Texto es: "+s3.getTexto());
//		Singleton s4 = Singleton.instanciaSingleton();
//		s4.setTexto("HOla4");
//		System.out.println("Texto es: "+s4.getTexto());
		
		for (int i = 0; i < 5; i++) {
			Singleton s5 = Singleton.instanciaSingleton();
			s5.setTexto("HOla"+i);
			s5.setPrecio(i);
			System.out.println("Texto es: "+s5.getTexto());
			al.add(s5.toString());
//			members.put("s"+i, s5.toString());
//			s5.clean();
		}
		
//		for (int i = 0; i < members.size(); i++) {
//			String s = members.get("s"+i);
//			System.err.println(s);
//		}
//		Singleton s1 = Singleton.instanciaSingleton();
//		System.out.println("Total de objetos: "+s1.getPrecio());
		for (int j = 0; j < al.size(); j++) {
			System.err.println(al.get(j));
		}
		
		
//		for (int i = 0; i < 5; i++) {
//			SEnum se = SEnum.s;
//			se.setTexto("xvcv"+i);
//			System.out.println(se.getTexto());
//			als.add(se);
//		}
//		
//		
//		for (int j = 0; j < als.size(); j++) {
//			System.err.println(als.get(j).getTexto());
//		}
	}

}
