package kata.fizzbuzz;

public class Fizzbuzz {

	public static String resultatPour(int nombre) {
		if (nombre%3==0) {
			return "fizz";
		}
		if (nombre==5) {
			return "buzz";
		}
		return String.valueOf(nombre);
	}
	

}
