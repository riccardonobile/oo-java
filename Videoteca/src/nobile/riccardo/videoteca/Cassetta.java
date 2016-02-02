package nobile.riccardo.videoteca;

public class Cassetta extends Supporto {
	
	@Override
	public int costoNoleggio(int tempo) {
		return (tempo * 2 - 1) * 1000;
	}

}
