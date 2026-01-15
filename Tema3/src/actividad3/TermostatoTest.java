package actividad3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TermostatoTest {

	private static Termostato termostato;
	
	@BeforeEach
	public void Termostato() {
		
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

		double temperaturaMin = termostato.getTemperaturaMin();
		assertEquals(10, temperaturaMin);
		
	}

	@Test
	void testGetTemperaturaMax() {
		
		double temperaturaMax = termostato.getTemperaturaMax();
		assertEquals(30, temperaturaMax);
		
	}

	@Test
	void testSetEncendido() {
		
		termostato.setEncendido(true);
		assertEquals(true, termostato.isEncendido());
		
	}

	@Test
	void testSetTemperaturaMinEntra() {
		
		termostato.setTemperaturaMin(18);
		assertEquals(18, termostato.getTemperaturaMin());
		assertEquals(20, termostato.getTemperaturaActual());
		
	}
	
	@Test
	void testSetTemperaturaMinNoEntra() {
		
		termostato.setTemperaturaMin(21);
		assertEquals(21, termostato.getTemperaturaMin());
		assertEquals(20, termostato.getTemperaturaActual());
		
	}

	@Test
	void testSetTemperaturaMaxEntra() {
		
		termostato.setTemperaturaMax(25);
		assertEquals(25, termostato.getTemperaturaMax());
		assertEquals(20, termostato.getTemperaturaActual());
		
	}
	
	@Test
	void testSetTemperaturaMaxNoEntra() {
		
		termostato.setTemperaturaMax(19);
		assertEquals(19, termostato.getTemperaturaMax());
		assertEquals(19, termostato.getTemperaturaActual());
		
	}
	
	@Test
	void testSetTemperaturaActualEntra() {
		
		try {
			
			termostato.setTemperaturaActual(31);
			assertEquals(31, termostato.getTemperaturaActual());
			
			fail("ERROR. Se debería haber lanzado una excepción.");
			
		}
		catch(IllegalArgumentException iae) {
			
			// Prueba correcta
			
		}
		
	}

	@Test
	void testSetTemperaturaActualNoEntra() {
		
		termostato.setTemperaturaActual(22);
		assertEquals(22, termostato.getTemperaturaActual());
		
	}

	@Test
	void testEncender() {
		
		termostato.encender();
		assertEquals(true, termostato.isEncendido());
		
	}

	@Test
	void testApagar() {
		
		termostato.apagar();
		assertEquals(false, termostato.isEncendido());
		
	}

	@Test
	void testSubirNoEncendido() {
		
		try {
			
			termostato.subir(5);
			assertEquals(25, termostato.getTemperaturaActual());
			fail("ERROR. Se debería haber lanzado una excepción.");
			
		}
		catch(IllegalStateException ise) {
			
			// Prueba correcta
			
		}
		
	}
		
	@Test
	void testSubirGradosNegativos() {
		
		try {
			
			termostato.subir(0);
			assertEquals(20, termostato.getTemperaturaActual());
			fail("ERROR. Se debería haber lanzado una excepción.");
			
		}
		catch(IllegalArgumentException iae) {
			
			// Prueba correcta
			
		}
		
	}
	
	@Test
	void testSubirTemperaturaMayorMax() {
		
		try {
			
			termostato.subir(12);
			assertEquals(32, termostato.getTemperaturaActual());
			fail("ERROR. Se debería haber lanzado una excepción.");
			
		}
		catch(IllegalStateException ise) {
			
			// Prueba correcta
			
		}
		
	}
	
	@Test
	void testSubirCorrecto() {
		
		termostato.encender();
		termostato.subir(5);
		assertEquals(25, termostato.getTemperaturaActual());
		
	}

	@Test
	void testBajar() {
		fail("Not yet implemented");
	}

}
