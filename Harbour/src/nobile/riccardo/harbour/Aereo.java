package nobile.riccardo.harbour;

public class Aereo extends Invasore {
	
	private int armamentiAlpha;
	private int armamentiBeta;
	
	@Override
	public int calcolaIndiceP() {
		return armamentiAlpha * 10 + armamentiBeta * 25;
	}

	
	public int getArmamentiAlpha() {
		return armamentiAlpha;
	}

	public void setArmamentiAlpha(int armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}

	public int getArmamentiBeta() {
		return armamentiBeta;
	}

	public void setArmamentiBeta(int armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}
	
}
