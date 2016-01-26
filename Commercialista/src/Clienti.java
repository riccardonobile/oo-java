
public class Clienti {
	protected String nome;
	protected String cognome;
	protected String cf;
	
	Clienti() {
		
	}
	
	Clienti(String name, String surname, String cf) {
		this.nome = name;
		this.cognome = surname;
		this.cf = cf;
	}
	
	public String getName() {
		return nome;
	}
	
	public void setName(String name) {
		this.nome = name;
	}
	
	public String getSurname() {
		return cognome;
	}
	
	public void setSurname(String surname) {
		this.cognome = surname;
	}
	
	public String getCf() {
		return cf;
	}
	
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public int getParcella() {
		return 0;
	}
}
