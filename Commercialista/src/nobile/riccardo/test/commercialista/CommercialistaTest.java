package nobile.riccardo.test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import nobile.riccardo.commercialista.Cliente;
import nobile.riccardo.commercialista.Commercialista;
import nobile.riccardo.commercialista.Dipendente;
import nobile.riccardo.commercialista.Imprenditore;
import nobile.riccardo.commercialista.LiberoProfessionista;

public class CommercialistaTest {

	@Test
	public void testTotaleIncasso() {
		
		Dipendente angelo = new Dipendente("Angelo", "Rossi", "000");
		Imprenditore marco = new Imprenditore("Marco", "Verdi", "000", "000", "Ferramenta di Marco", 99);
		LiberoProfessionista paolo = new LiberoProfessionista("Paolo", "Bianchi", "000", "000", 15);

		Cliente[] clienti = new Cliente[] {
				angelo,
				marco,
				paolo
		};
	
		Commercialista c = new Commercialista(clienti);
		
		assertEquals(607500, c.totaleIncasso());
		
	}

}
