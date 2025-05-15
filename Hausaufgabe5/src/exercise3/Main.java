package exercise3;

public class Main {

	public static void main(String[] args) {
		try {
			Calculator.divide(3, 0);
		} catch (ArithmeticException e) {
			System.out.println("Ein arithmetischer Fehler ist aufgetreten: " + e.getMessage());
		}

	}
}
