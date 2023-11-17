import java.util.*;

public class Opposite_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of alphabets");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			System.out.println("Enter alphabet");
			char c = sc.next().charAt(0);
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);
				System.out.println("Alphabet in small letter: " + c);
			} else if (c >= 'a' && c <= 'z') {
				c = (char) (c - 32);
				System.out.println("Alphabet in capital letter: " + c);
			} else
				System.out.println(c + " is not an alphabet");
		}

	}

}
