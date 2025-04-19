package aufgabe2;

import java.util.Scanner;

public class SnakeTranslator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Wort eingeben: ");
		String eingabe = scanner.next();
		String ausgabe = "";
		for (int i = 0; i < eingabe.length(); i++) {
			char buchstabe = eingabe.charAt(i);
			ausgabe += buchstabe;
			if ("aeiouAEIOU".contains(String.valueOf(buchstabe))) {
				ausgabe = ausgabe + "s" + buchstabe;
			}
		}
		scanner.close();
		System.out.println(ausgabe);
	}
}
