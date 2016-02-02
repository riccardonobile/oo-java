package nobile.riccardo.videoteca;

public class Dvd extends Supporto{
	
	@Override
	public int costoNoleggio(int tempo) {
		int costo;
		
		if(tempo <= 2) {
			costo = Math.round((1.5f * tempo) * 1000);
		} else {
			costo = (3 + (2 * tempo)) * 1000;
		}
		
		return costo;
	}

}
