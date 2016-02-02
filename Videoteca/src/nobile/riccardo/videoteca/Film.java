package nobile.riccardo.videoteca;

public class Film {
	
	private String titolo;
	private Regista regista;
	private int anno;
	private Attore[] attori;
	
	public Film() {
		
	}
	
	public Film(String titolo, Regista regista, int anno, Attore[] attori) {
		this.titolo = titolo;
		this.regista = regista;
		this.anno = anno;
		this.attori = attori;
	}
	

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Regista getRegista() {
		return regista;
	}

	public void setRegista(Regista regista) {
		this.regista = regista;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public Attore[] getAttori() {
		return attori;
	}

	public void setAttori(Attore[] attori) {
		this.attori = attori;
	}
	
}
