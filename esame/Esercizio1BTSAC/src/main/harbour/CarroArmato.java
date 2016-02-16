/* jUnit Test OK */
package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore {
	private int stazza;
	private int missili;
	
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	public int getMissili() {
		return missili;
	}
	public void setMissili(int missili) {
		this.missili = missili;
	}
	@Override
	public int potenzaFuoco() {
		return Math.round(missili * stazza * 0.3f);
	}
}
