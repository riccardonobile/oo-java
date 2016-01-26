
public class Dipendenti extends Clienti {
	
	Dipendenti() {
		
	}
	
	Dipendenti(String name, String surname, String cf) {
		this.nome = name;
		this.cognome = surname;
		this.cf = cf;
	}
	
	public int getParcella() {
		return 50000;
	}
}
