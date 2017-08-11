package kata.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzbuzzTest {

	@Test
	public void retourneNombreSiUN() {
		assertEquals(Fizzbuzz.resultatPour(1), "1");
	}

}
