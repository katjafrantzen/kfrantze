package aufgabe1;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		int numberToGuess = (int) (Math.random() * 20) + 1;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Zahl eingeben:");
			int zahl = scanner.nextInt();

			if (zahl == numberToGuess) {
				System.out.println("Gewonnen!");
				break;
			} else if (zahl < numberToGuess) {
				System.out.println("Zu niedrig.");
			} else if (zahl > numberToGuess) {
				System.out.println("Zu hoch.");
			}
		}
		scanner.close();
	}

}
