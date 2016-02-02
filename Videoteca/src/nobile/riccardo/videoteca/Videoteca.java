package nobile.riccardo.videoteca;

public class Videoteca {
	
	private Noleggio[] noleggi;
	
	public Videoteca() {
		
	}
	
	public Videoteca(Noleggio[] noleggi) {
		this.noleggi = noleggi;
	}
	
	public int incassoTotale() {
		int incasso = 0;
		
		for(Noleggio n:noleggi) {
			incasso += n.costo();
		}
		
		return incasso;
	}

	
	public Noleggio[] getNoleggi() {
		return noleggi;
	}

	public void setNoleggi(Noleggio[] noleggi) {
		this.noleggi = noleggi;
	}

}
