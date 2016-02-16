/* jUnit Test OK */
package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class AeroPorto {
	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}
	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
	}
	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}
	public void setDimensioneSqMetersNonDistrutta(int dimensioneSqMetersNonDistrutta) {
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
	}
	public void addMetriQuadriDistrutti(double dimensione) {
		dimensioneSqMetersNonDistrutta = 
				Math.max(dimensioneSqMetersNonDistrutta - dimensione, 0);
	}
}
