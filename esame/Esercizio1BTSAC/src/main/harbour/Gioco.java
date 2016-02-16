/* jUnit Test OK */
package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	private AeroPorto aeroporto;

	public Gioco(AeroPorto p) {
		this.aeroporto = p;
	}
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			int potenzadifuoco = inv.potenzaFuoco();
			aeroporto.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
		}
	}
	
	public boolean portoDistrutto(){
		return aeroporto.getDimensioneSqMetersNonDistrutta() <= 0; 
	}
}
