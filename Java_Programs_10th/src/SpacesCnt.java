import java.util.Scanner;

public class SpacesCnt {

	public static void main(String[] args) {
		SpaceCnt();
		WordsCnt();
		AlphabetsCnt();
		NumeralsCnt();
	}

	public static void SpaceCnt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String value = sc.nextLine();

		int count = 0;
		String arr[] = value.split(" ");
		count = arr.length - 1;
		System.out.println("Total number of spaces: " + count);
	}

	public static void WordsCnt() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String words = sc.nextLine();

		int wordCount = 0;

		boolean word = false;
		int endOfLine = words.length() - 1;

		for (int i = 0; i < words.length(); i++) {
			// if the char is a letter, word = true.
			if (Character.isLetter(words.charAt(i)) && i != endOfLine) {
				word = true;
				// if char isn't a letter and there have been letters before,
				// counter goes up.
			} else if (!Character.isLetter(words.charAt(i)) && word) {
				wordCount++;
				word = false;
				// last word of String; if it doesn't end with a non letter, it
				// wouldn't count without this.
			} else if (Character.isLetter(words.charAt(i)) && i == endOfLine) {
				wordCount++;
			}
		}
		System.out.println("Total number of words: " + wordCount);
	}

	public static void AlphabetsCnt() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int alphacount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				alphacount++;
		}
		System.out.println("Total number of alphabets: " + alphacount);
	}

	public static void NumeralsCnt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String numeralstr = sc.nextLine();

		int digitscount = 0;
		for (int i = 0; i < numeralstr.length(); i++) {
			if (Character.isDigit(numeralstr.charAt(i)))
				digitscount++;
		}
		System.out.println("Total number of numerals: " + digitscount);

	}

}
