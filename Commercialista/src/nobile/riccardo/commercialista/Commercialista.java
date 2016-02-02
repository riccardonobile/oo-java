package nobile.riccardo.commercialista;

public class Commercialista {

	private Cliente[] clienti;
	
	public Commercialista() {
		
	}
	
	public Commercialista(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	public int totaleIncasso() {
		
		int incasso = 0;
		
		for(Cliente c:clienti) {
			if(c instanceof CalcolaParcella) {
				incasso += c.calcolaParcella();
			}
		}
		
		return incasso;
		
	}

}
