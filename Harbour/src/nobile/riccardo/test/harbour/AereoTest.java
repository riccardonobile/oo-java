package nobile.riccardo.test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.harbour.Aereo;

public class AereoTest {

	@Test
	public void test() {
		Aereo a = new Aereo();
		a.setCodice("A0001");
		a.setModello("Aereo di test");
		a.setArmamentiAlpha(150);
		a.setArmamentiBeta(12);
		
		int indiceP = a.calcolaIndiceP();
		
		assertEquals(1800, indiceP);
	}

}
