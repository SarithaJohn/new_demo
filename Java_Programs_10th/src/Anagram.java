import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// Anagram();
		DescendingOrder();
	}

	public static void DescendingOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = sc.nextLine().toUpperCase().replaceAll("\\s", "");
		String new_word = "";
		char word_sort;

		for (int i = 0; i < word.length(); i++) {
			if (Character.isLetter(word.charAt(i))) {
				new_word += word.charAt(i);
			}
		}
		char arr_word[] = new_word.toCharArray();
		boolean flag = false;
		if (new_word != null) {
			flag = true;
			for (int i = 0; i < arr_word.length; i++) {
				for (int j = i + 1; j < arr_word.length; j++) {
					if ((int) arr_word[i] < (int) arr_word[j]) {
						word_sort = arr_word[i];
						arr_word[i] = arr_word[j];
						arr_word[j] = word_sort;
					}
				}

			}
		}
		if (flag) {
			System.out.println("New word is: " + new String(arr_word));
		} else {
			System.out.println("please enter proper word");
		}

	}

	public static void Anagram() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first word: ");
		String word = sc.nextLine().toLowerCase().replaceAll("\\s", "");
		System.out.println("Input second word: ");
		String anagram = sc.nextLine().toLowerCase().replaceAll("\\s", "");
		StringBuilder str_anagram = new StringBuilder(anagram);
		boolean isAnagram = false;
		int index = 0;
		if (word != null && anagram != null && word.length() == anagram.length()) {
			for (int i = 0; i < word.length(); i++) {
				for (int j = 0; j < str_anagram.length(); j++) {
					if (word.charAt(i) == str_anagram.charAt(j)) {
						str_anagram.deleteCharAt(j);
						break;
					}
				}
			}

		}
		isAnagram = str_anagram.toString().isEmpty();
		if (isAnagram) {
			System.out.println("Two words are Anagram");
		} else {
			System.out.println("Words are not Anagram");
		}
	}

}
