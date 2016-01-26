package nobile.riccardo.azienda;

public class Azienda {
	private String ragioneSociale;
	private Dipendente[] dipendenti;
	
	public Azienda(String ragioneSociale, Dipendente[] dipendenti) {
		this.ragioneSociale = ragioneSociale;
		this.dipendenti = dipendenti;
	}
}
