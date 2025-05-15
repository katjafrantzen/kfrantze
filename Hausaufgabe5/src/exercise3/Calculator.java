package exercise3;

public class Calculator {
	public static double divide(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Der Nenner darf nicht null sein");
		}
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println(Calculator.divide(3, 0));
	}
}