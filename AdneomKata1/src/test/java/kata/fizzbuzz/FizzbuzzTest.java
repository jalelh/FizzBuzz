package kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzbuzzTest {

	@Test
	public void retourneNombreSiNonMultipleDeTroisNiDeCinq() {
		assertEquals(Fizzbuzz.resultatPour(1), "1");
		assertEquals(Fizzbuzz.resultatPour(2), "2");
	}
	
	@Test
	public void retourneFizzSiMultipleDeTrois() {
		assertEquals(Fizzbuzz.resultatPour(3), "fizz");
		assertEquals(Fizzbuzz.resultatPour(6), "fizz");
	}
	
	@Test
	public void retourneBuzzSiMultipleDeCinq() {
		assertEquals(Fizzbuzz.resultatPour(5), "buzz");
		assertEquals(Fizzbuzz.resultatPour(10), "buzz");
	}
	
	@Test
	public void retourneFizzBuzzSiMultipleDeQuinze() {
		assertEquals(Fizzbuzz.resultatPour(15), "fizzbuzz");
		assertEquals(Fizzbuzz.resultatPour(30), "fizzbuzz");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retourneExceptionSiZero() {
		Fizzbuzz.resultatPour(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void retourneExceptionSiNegative() {
		Fizzbuzz.resultatPour(-1);
	}

}
