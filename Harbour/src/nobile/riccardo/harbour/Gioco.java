package nobile.riccardo.harbour;

public class Gioco {
	
	private PortoNavale porto;
	private Invasore[] invasori;
	
	public void attacca() {
		double dimensionePorto = porto.getDimensione();
		
		for(Invasore i:invasori) {
			int indiceP = i.calcolaIndiceP();
			dimensionePorto = dimensionePorto - indiceP * 1.5;
		}
		
		porto.setDimensione(dimensionePorto);
	}
	
	public boolean portoDistrutto() {
		if(porto.getDimensione() > 0) {
			return false;
		} else {
			return true;
		}
	}
	

	public PortoNavale getPorto() {
		return porto;
	}

	public void setPorto(PortoNavale porto) {
		this.porto = porto;
	}

	public Invasore[] getInvasori() {
		return invasori;
	}

	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}

}
