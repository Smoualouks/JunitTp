package fr.diginamic.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolishUtilsTest {

	
	@Test
	 public void testEval() {
		
		int resultat = PolishUtils.eval("1,2,+,3,*");
		// Normalement la méthode doit retournée 9. Vérifions:
		assertEquals(9, resultat);
		assertTrue(resultat==9);
	}
}
