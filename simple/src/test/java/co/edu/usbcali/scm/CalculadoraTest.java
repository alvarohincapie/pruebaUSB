package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

import co.com.usbcali.scm.Calculadora;
import co.com.usbcali.scm.CalculadoraImpl;

public class CalculadoraTest {

	@Test
	public void testSumar() {
		Calculadora cal = new CalculadoraImpl();
		cal.sumar(1, 2);
		assertTrue(cal.obtenerResultado() == 3);
	}
	
	@Test
	public void testRestar() {
		Calculadora cal = new CalculadoraImpl();
		cal.restar(4, 4);
		assertTrue(cal.obtenerResultado() == 0);
	}

}
