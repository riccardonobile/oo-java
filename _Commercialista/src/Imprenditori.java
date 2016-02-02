
public class Imprenditori extends Clienti {
	private long piva;
	private String ragioneSociale;
	private int nFatture;
	
	Imprenditori() {
		
	}
	
	Imprenditori(String name, String surname, String cf, long piva, String ragioneSociale, int nFatture) {
		super(name, surname, cf);
		this.piva = piva;
		this.ragioneSociale = ragioneSociale;
		this.nFatture = nFatture;
	}
	
	public long getPiva() {
		return piva;
	}
	
	public void setPiva(long piva) {
		this.piva = piva;
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
	public int getnFatture() {
		return nFatture;
	}
	
	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	
	public int getParcella() {
		if (nFatture < 100) {
			return 500000;
		} else {
			return 500000 + (nFatture * 100);
		}
	}
}
