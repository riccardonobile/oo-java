package nobile.riccardo.maps;

import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> ms = new HashMap<>();
		
		ms.put(0, "Riccardo");
		ms.put(1, "Alessandro");
		
		System.out.println(ms);
		
		Map<Persona, String> mp = new HashMap<>();
		
		Persona p1 = new Persona();
		p1.setNome("Riccardo");
		p1.setCognome("Nobile");
		p1.setEta(19);
		
		Persona p2 = new Persona();
		p2.setNome("Riccardo");
		p2.setCognome("Nobile");
		p2.setEta(19);
		
		Persona p3 = new Persona();
		p3.setNome("Alessandro");
		p3.setCognome("Modaffari");
		p3.setEta(19);
		
		mp.put(p1, "Dio furbo");
		mp.put(p2, "Ciao");
		mp.put(p3, "Ciao 2");
		
		System.out.println(mp.get(p1));
		System.out.println(mp.get(p2));
		System.out.println(mp.get(p3));
	}
}
