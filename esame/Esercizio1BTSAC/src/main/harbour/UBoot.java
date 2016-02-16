/* jUnit Test OK */
package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore {
	private int ArmaK;
	private int ArmaH;
	public int getArmaK() {
		return ArmaK;
	}
	public void setArmaK(int armaK) {
		ArmaK = armaK;
	}
	public int getArmaH() {
		return ArmaH;
	}
	public void setArmaH(int armaH) {
		ArmaH = armaH;
	}
	@Override
	public int potenzaFuoco() {
		return ArmaK * 20 + ArmaH * 30;
	}
}