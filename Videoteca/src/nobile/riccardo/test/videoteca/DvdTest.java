package nobile.riccardo.test.videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.videoteca.Dvd;

public class DvdTest {

	@Test
	public void testCostoNoleggio() {		
		Dvd d = new Dvd();
		
		int costo = d.costoNoleggio(6);
		assertEquals(15 * 1000, costo);
		
		costo = d.costoNoleggio(1);
		assertEquals(Math.round(1.5f * 1000), costo);
	}

}
