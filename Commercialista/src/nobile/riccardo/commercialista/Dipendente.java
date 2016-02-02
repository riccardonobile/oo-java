package nobile.riccardo.commercialista;

public class Dipendente extends Cliente {
	
	public Dipendente() {
		super();
	}

	public Dipendente(String nome, String cognome, String cf) {
		super(nome, cognome, cf);
	}
	
	@Override
	public int calcolaParcella() {
		return 50 * 1000;
	}
	
}
