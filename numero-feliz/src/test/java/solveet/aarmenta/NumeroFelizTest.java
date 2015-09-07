package solveet.aarmenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroFelizTest {

	@Test
	public void esNumeroFeliz() {
		assertEquals(true, NumeroFeliz.esNumeroFeliz(1));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(7));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(10));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(68));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(91));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(100));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(109));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(167));
		assertEquals(true, NumeroFeliz.esNumeroFeliz(190));
	}
	
	@Test
	public void noEsNumeroFeliz() {		
		assertEquals(false, NumeroFeliz.esNumeroFeliz(8));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(16));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(21));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(48));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(101));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(131));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(175));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(181));
		assertEquals(false, NumeroFeliz.esNumeroFeliz(187));
	}
}
