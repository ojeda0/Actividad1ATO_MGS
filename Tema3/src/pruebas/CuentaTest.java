package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	private static Cuenta cuenta;
	
	@BeforeEach
	public static void nuevaCuenta() {
		
		cuenta = new Cuenta("ES6475893745", 100);
		
	}
	
	
	@Test
	void testGetSaldo() {
		// Cuenta cuenta1 = new Cuenta("ES6475893745", 100);
		double saldo = cuenta.getSaldo();
		assertEquals(400, saldo);
	}
	
	@Test
	void testSetSaldo() {
		// Cuenta cuenta1 = new Cuenta("ES6475893745", 100);
		cuenta.setSaldo(200);
		assertEquals(200, cuenta.getSaldo());
	}

	@Test
	void testIngresarDinero() {
		cuenta.ingresarDinero(300);
		assertEquals(400, cuenta.getSaldo());
	}

	@Test
	void testExtraerDinero() {
		try {
			
			//Cuenta cuenta1 = new Cuenta("ES6475893745", 100);
			cuenta.extraerDinero(120);
			fail("ERROR. Se debería haber lanzado una excepción.");
			
		}catch(ArithmeticException ae) {
			
			//Prueba correcta
			
		}
	}

}