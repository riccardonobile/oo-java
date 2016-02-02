package nobile.riccardo.harbour;

public class Harbour {

	public static void main(String[] args) {
		PortoNavale p = new PortoNavale();
		p.setNome("Porto uno");
		p.setNumeroImbarcazioni(15);
		p.setDimensione(300 * 1000);
		
		Sottomarino s1 = new Sottomarino();
		s1.setCodice("S0001");
		s1.setModello("Sottomarino uno");
		s1.setArmamenti(10);
		s1.setStazza(150);
		
		Sottomarino s2 = new Sottomarino();
		s2.setCodice("S0002");
		s2.setModello("Sottomarino due");
		s2.setArmamenti(100);
		s2.setStazza(180);
		
		Aereo a1 = new Aereo();
		a1.setCodice("A0001");
		a1.setModello("Aereo uno");
		a1.setArmamentiAlpha(150);
		a1.setArmamentiBeta(12);
		
		Aereo a2 = new Aereo();
		a2.setCodice("A0002");
		a2.setModello("Aereo due");
		a2.setArmamentiAlpha(15);
		a2.setArmamentiBeta(160);
		
		Invasore[] invasori = new Invasore[] {
				s1,
				s2,
				a1,
				a2
		};
		
		Gioco g = new Gioco();
		g.setPorto(p);
		g.setInvasori(invasori);
		
		int contaAttacchi = 0;
		
		while(!g.portoDistrutto()) {
			g.attacca();
			contaAttacchi++;
		}
		
		System.out.println("Il porto è stato distrutto dopo: " + contaAttacchi + " attacchi.");

	}

}
