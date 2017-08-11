package kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzbuzzTest {

	@Test
	public void retourneNombreSiUN() {
		assertEquals(Fizzbuzz.resultatPour(1), "1");
	}
	
	@Test
	public void retourneNombreSiDeux() {
		assertEquals(Fizzbuzz.resultatPour(2), "2");
	}
	
	@Test
	public void retourneFizzSiTrois() {
		assertEquals(Fizzbuzz.resultatPour(3), "fizz");
	}
	
	@Test
	public void retourneFizzSiSix() {
		assertEquals(Fizzbuzz.resultatPour(6), "fizz");
	}
	
	@Test
	public void retourneBuzzSiCinq() {
		assertEquals(Fizzbuzz.resultatPour(5), "buzz");
	}
	
	@Test
	public void retourneBuzzSiDix() {
		assertEquals(Fizzbuzz.resultatPour(10), "buzz");
	}

}
