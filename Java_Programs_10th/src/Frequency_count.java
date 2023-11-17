import java.util.Scanner;

public class Frequency_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 0; i <= 9; i++) {
			int j = n;
			int c = 0;
			while (j > 0) {
				int d = j % 10;
				if (d == i)
					c++;
				j /= 10;
			}
			if (c > 0)
				System.out.println("Count of " + i + " is " + c);
		}
	}

}
