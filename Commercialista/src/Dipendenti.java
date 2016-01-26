
public class Dipendenti extends Clienti {
	
	Dipendenti() {
		
	}
	
	Dipendenti(String name, String surname, String cf) {
		super(name, surname, cf);
	}
	
	public int getParcella() {
		return 50000;
	}
}
