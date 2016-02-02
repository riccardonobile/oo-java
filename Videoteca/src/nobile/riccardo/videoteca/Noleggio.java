package nobile.riccardo.videoteca;

public class Noleggio {
	
	private Film film;
	private Supporto supporto;
	private int tempo;
	
	public Noleggio() {
		
	}
	
	public Noleggio(Film film, Supporto supporto, int tempo) {
		this.film = film;
		this.supporto = supporto;
		this.tempo = tempo;
	}
	
	public int costo() {
		return supporto.costoNoleggio(tempo);
	}
	

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Supporto getSupporto() {
		return supporto;
	}

	public void setSupporto(Supporto supporto) {
		this.supporto = supporto;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

}
