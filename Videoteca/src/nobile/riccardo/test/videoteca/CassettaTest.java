package nobile.riccardo.test.videoteca;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.videoteca.Cassetta;

public class CassettaTest {

	@Test
	public void testCostoNoleggio() {
		Cassetta c = new Cassetta();
		
		int costo = c.costoNoleggio(6);
		assertEquals(11 * 1000, costo);
	}

}
