package nobile.riccardo.azienda;

public class Dipendente {
	String nome;
	String cognome;
	Contratto contratto;
	int anzianita;
	double incremento;
	
	public Dipendente() {}
	
	public Dipendente(String nome, String cognome, int anzianita, Contratto contratto) {
		this.nome = nome;
		this.cognome = cognome;
		this.anzianita = anzianita;
		this.contratto = contratto;
	}
	
	public double calcoloStipendio() {
		int stipendioBase = contratto.getStipendioBase();
		float stipendioBaseTemp = stipendioBase + (0.5f * anzianita * stipendioBase);
		return Math.floor(stipendioBaseTemp);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Contratto getContratto() {
		return contratto;
	}

	public void setContratto(Contratto contratto) {
		this.contratto = contratto;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public double getIncremento() {
		return incremento;
	}

	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}
	
}
