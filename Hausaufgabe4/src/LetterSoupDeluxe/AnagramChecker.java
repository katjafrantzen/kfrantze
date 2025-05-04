package LetterSoupDeluxe;

import java.util.Scanner;

public class AnagramChecker {

	public static boolean isAnagram(String a, String b) {
		int[] buchstabenA = countLetters(a);
		int[] buchstabenB = countLetters(b);
		for (int i = 0; i < buchstabenA.length; i++) {
			if (buchstabenA[i] != buchstabenB[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] countLetters(String s) {
		int[] counts = new int[26];
		String alphabet = "abcdefghijklmnoppqrstuvwxyz";
		for (int i = 0; i < counts.length; i++) {
			int anzahl = 0;
			String buchstabe = alphabet.substring(i, i + 1);
			anzahl = s.length() - s.replace(buchstabe, "").length();
			counts[i] = anzahl;
		}
		return counts;
	}

	public static void printLetterCounts(String s) {
		int[] buchstaben = countLetters(s);
		String alphabet = "abcdefghijklmnoppqrstuvwxyz";
		for (int i = 0; i < buchstaben.length; i++) {
			if (buchstaben[i] != 0) {
				System.out.println(alphabet.substring(i, i + 1) + ": " + buchstaben[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String word1 = scanner.nextLine();
		word1 = word1.toLowerCase();
		word1.replaceAll(" ", "");

		System.out.print("Enter the second word: ");
		String word2 = scanner.nextLine();
		word2 = word2.toLowerCase();
		word2.replaceAll(" ", "");

		System.out.println("Are they anagrams? " + isAnagram(word1, word2));
		printLetterCounts(word1);

		scanner.close();
	}
}
