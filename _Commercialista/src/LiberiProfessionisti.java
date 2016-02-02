
public class LiberiProfessionisti extends Clienti{
	private long piva;
	private int nFatture;
	
	LiberiProfessionisti() {
		
	}
	
	LiberiProfessionisti(String name, String surname, String cf, long piva, int nFatture) {
		super(name, surname, cf);
		this.piva = piva;
		this.nFatture = nFatture;
	}
	
	public long getPiva() {
		return piva;
	}
	
	public void setPiva(long piva) {
		this.piva = piva;
	}
	
	
	public int getnFatture() {
		return nFatture;
	}

	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}

	public int getParcella() {
		int tot = 50000 + (nFatture * 500);
		return tot;
	}
}
