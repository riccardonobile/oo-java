package nobile.riccardo.harbour;

public class Sottomarino extends Invasore {
	
	private int armamenti;
	private int stazza;
	
	@Override
	public int calcolaIndiceP() {
		return armamenti * stazza;
	}

	
	public int getArmamenti() {
		return armamenti;
	}

	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

}
