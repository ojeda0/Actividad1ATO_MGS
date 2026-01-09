package actividad3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TermostatoTest {

	private static Termostato termostato;
	
	@BeforeAll
	public static void Termostato() {
		
		termostato = new Termostato(10, 30, 20);
		
	}
	
	@Test
	void testIsEncendido() {
		
		boolean encendido = termostato.isEncendido();
		assertEquals(false, encendido);
		
	}

	@Test
	void testGetTemperaturaActual() {
		
		double temperaturaActual = termostato.getTemperaturaActual();
		assertEquals(20, temperaturaActual);
		
	}

	@Test
	void testGetTemperaturaMin() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTemperaturaMax() {
		fail("Not yet implemented");
	}

	@Test
	void testSetEncendido() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTemperaturaMin() {
		
		termostato.setTemperaturaMin(18);
		assertEquals(18, termostato.getTemperaturaMin());
		
	}

	@Test
	void testSetTemperaturaMax() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTemperaturaActual() {
		fail("Not yet implemented");
	}

	@Test
	void testEncender() {
		fail("Not yet implemented");
	}

	@Test
	void testApagar() {
		fail("Not yet implemented");
	}

	@Test
	void testSubir() {
		fail("Not yet implemented");
	}

	@Test
	void testBajar() {
		fail("Not yet implemented");
	}

}
