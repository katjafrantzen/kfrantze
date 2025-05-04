package LetterSoupDeluxe;
import java.util.Scanner;

public class AnagramChecker {

	public static boolean isAnagram(String a, String b) {
		
	}
	
	public static int[] countLetters(String s) {
		int [] counts = new int[26];
	}
	
	public static void printLetterCounts(String s) {
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String word1 = scanner.nextLine();
		
		System.out.print("Enter the second word: ");
		String word2 = scanner.nextLine();
		
		//TODO
		
		System.out.println("Are they anagrams? " + isAnagram(word1, word2));
		printLetterCounts(word1);
	}
}
