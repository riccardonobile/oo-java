package nobile.riccardo.test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.harbour.Sottomarino;

public class SottomarinoTest {

	@Test
	public void testCalcolaIndiceP() {
		Sottomarino s = new Sottomarino();
		s.setCodice("S0001");
		s.setModello("Sottomarino di test");
		s.setArmamenti(10);
		s.setStazza(150);
		
		int indiceP = s.calcolaIndiceP();
		
		assertEquals(1500, indiceP);
	}

}
