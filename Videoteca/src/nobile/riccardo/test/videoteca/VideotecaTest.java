package nobile.riccardo.test.videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.videoteca.Attore;
import nobile.riccardo.videoteca.Cassetta;
import nobile.riccardo.videoteca.Dvd;
import nobile.riccardo.videoteca.Film;
import nobile.riccardo.videoteca.Noleggio;
import nobile.riccardo.videoteca.Regista;
import nobile.riccardo.videoteca.Videoteca;

public class VideotecaTest {

	@Test
	public void testIncassoTotale() {
		Attore a1 = new Attore("Attore", "Uno");
		Attore a2 = new Attore("Attore", "Due");
		Regista r1 = new Regista("Regista", "Uno");
		
		Attore[] attori1 = new Attore[] {
				a1,
				a2
		};
		
		Film f1 = new Film("Film Uno", r1, 2015, attori1);
		
		Cassetta c = new Cassetta();	// Posso rendere Cassetta abstract e passare direttamente Cassetta???
		Dvd d = new Dvd();
		
		Noleggio n1 = new Noleggio(f1, c, 6);
		Noleggio n2 = new Noleggio(f1, d, 5);
		Noleggio n3 = new Noleggio(f1, d, 2);
		
		Noleggio[] noleggi1 = new Noleggio[] {
				n1,
				n2,
				n3
		};
		
		Videoteca v1 = new Videoteca(noleggi1);
		
		int incasso = v1.incassoTotale();
		
		assertEquals(27 * 1000, incasso);
	}

}
