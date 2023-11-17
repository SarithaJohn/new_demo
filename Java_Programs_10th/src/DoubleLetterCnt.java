import java.util.Scanner;

public class DoubleLetterCnt {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String sentence = sc.nextLine().toLowerCase();
		int length = sentence.length();
		for (int i = 0; i < length - 1; i++) {
			if (sentence.charAt(i) == sentence.charAt(i + 1)) {
				count++;
			}
		}
		System.out.println("Number of Double Letter Sequence is " + count);

	}

}
