package kata.fizzbuzz;

public class Fizzbuzz {

	public static String resultatPour(int nombre) {
		if(nombre<=0) {
			throw new IllegalArgumentException("nomber inférieur a 1");
		}
		
		if (nombre%15==0) {
			return "fizzbuzz";
		}else if (nombre%3==0) {
			return "fizz";
		}else if (nombre%5==0) {
			return "buzz";
		}
		return String.valueOf(nombre);
	}
	

}
