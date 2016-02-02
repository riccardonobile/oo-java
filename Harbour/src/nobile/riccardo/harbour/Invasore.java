package nobile.riccardo.harbour;

public abstract class Invasore implements CalcolaIndiceP {
	
	private String codice;
	private String modello;
	
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}

}
