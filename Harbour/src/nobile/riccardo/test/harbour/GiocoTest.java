package nobile.riccardo.test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.harbour.Aereo;
import nobile.riccardo.harbour.Gioco;
import nobile.riccardo.harbour.Invasore;
import nobile.riccardo.harbour.PortoNavale;
import nobile.riccardo.harbour.Sottomarino;

public class GiocoTest {

	@Test
	public void testAttacca() {
		PortoNavale p = new PortoNavale();
		p.setNome("Porto di test");
		p.setNumeroImbarcazioni(15);
		p.setDimensione(30 * 1000);
		
		Sottomarino s = new Sottomarino();
		s.setCodice("S0001");
		s.setModello("Sottomarino di test");
		s.setArmamenti(10);
		s.setStazza(150);
		
		Aereo a = new Aereo();
		a.setCodice("A0001");
		a.setModello("Aereo di test");
		a.setArmamentiAlpha(150);
		a.setArmamentiBeta(12);
		
		Invasore[] invasori = new Invasore[] {
				s,
				a
		};
		
		Gioco g = new Gioco();
		g.setPorto(p);
		g.setInvasori(invasori);
		
		g.attacca();
		
		
		double dim = p.getDimensione();
		assertEquals(25050.0, dim, 0);
	}

	@Test
	public void testDistrutto() {
		PortoNavale p = new PortoNavale();
		p.setNome("Porto di test");
		p.setNumeroImbarcazioni(15);
		p.setDimensione(30 * 1000);
		
		Sottomarino s = new Sottomarino();
		s.setCodice("S0001");
		s.setModello("Sottomarino di test");
		s.setArmamenti(10);
		s.setStazza(150);
		
		Aereo a = new Aereo();
		a.setCodice("A0001");
		a.setModello("Aereo di test");
		a.setArmamentiAlpha(150);
		a.setArmamentiBeta(12);
		
		Invasore[] invasori = new Invasore[] {
				s,
				a
		};
		
		Gioco g = new Gioco();
		g.setPorto(p);
		g.setInvasori(invasori);
		
		boolean distrutto = g.portoDistrutto();
		
		assertEquals(false, distrutto);
	}

}
