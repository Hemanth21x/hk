package projects;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence to count : ");
		String str = sc.nextLine();

		int charcount = 0;
		int vowelcount = 0;
		int constcount = 0;

		String[] words = str.trim().split("\\s+");
		int wordcount = words.length;

		for (int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));

			if (str.charAt(i) != ' ') {

				charcount++;
			}

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelcount++;
			} else if (Character.isLetter(ch)) {
				constcount++;
			}

		}

		String longestWord = words[0];
		String shortestWord = words[0];

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > longestWord.length()) {
				longestWord = words[i];
			}

			if (words[i].length() < shortestWord.length()) {
				shortestWord = words[i];
			}

		}
		System.out.println("Words           : " + wordcount);
		System.out.println("Characters      : " + charcount);
		System.out.println("Vowels          : " + vowelcount);
		System.out.println("Consonants      : " + constcount);
		System.out.println("Longest Word    : " + longestWord);
		System.out.println("Shortest Word   : " + shortestWord);
		sc.close();
	}

}
