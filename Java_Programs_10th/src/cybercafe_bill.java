import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class cybercafe_bill {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// cybercafe_bill();
		// DivisibleBy_3and5();
		// sum_product();
		// AmicableOrNot();
		Unicodevalues();
		// InputDecode();
		// NthTerm();
		// Print_specialcharacters();
		// Print_specialcharacters2();
	}

	public static void cybercafe_bill() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name and time utilized in hours");
		String na = sc.next();
		double hr = sc.nextDouble();
		double charge;
		if (hr <= 1)
			charge = 10.0;
		else if (hr <= 5)
			charge = 10 + (hr - 1) * 15;
		else
			charge = 10 + 4 * 15 + (hr - 5) * 20;
		System.out.println("Time utilized: " + hr + " hours");
		System.out.print("Charge: Rs." + charge + "/-");
	}

	public static void DivisibleBy_3and5() {
		int c = 1;
		for (int i = 1; c <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
				c++;
			}
		}
	}

	public static void sum_product() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for n");
		int n = sc.nextInt();
		int exp = 0;
		double a = 2, first = 4, number, sum = 4, product = 4;
		for (int i = 1; i < n; i++) {
			number = first + 5 * (Math.pow(a, exp));
			exp++;
			sum = sum + number;
			product = product * number;
			first = number;
		}

		System.out.println("sum of the series: " + sum);
		System.out.println("product of the series: " + product);
	}

	public static void AmicableOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int s = 0, i;
		for (i = 1; i <= x / 2; i++) {
			if (x % i == 0)
				s += i;
		}
		if (s == y) {
			s = 0;
			for (i = 1; i <= y / 2; i++) {
				if (y % i == 0)
					s += i;
			}
			if (s == x)
				System.out.println("Amicable numbers");
			else
				System.out.println("Not Amicable numbers");
		} else
			System.out.println("Not Amicable numbers");
	}

	public static void Unicodevalues() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.print("\n Enter a character : ");
			char c = sc.next().charAt(0);
			int cNumber = (int) c;
			System.out.printf("Unicode value: U+%4x", cNumber);
			sum = (sum + Integer.parseInt(String.format("%x", cNumber), 16));
		}
		System.out.printf("\nSum of ASCII Decimal values : " + sum + ", Unicode value: U+%4x", sum);
	}

	public static void InputDecode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of characters");
		int n = sc.nextInt();
		int c1 = 0, c2 = 0, c3 = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter character : ");
			char c = sc.next().charAt(0);
			if ((int) c >= 65 && (int) c <= 90 || (int) c >= 97 && (int) c <= 122)
				c1++;
			else if ((int) c >= 48 && (int) c <= 57)
				c2++;
			else
				c3++;
		}
		System.out.println("Count of alphabets: " + c1);
		System.out.println("Count of digits: " + c2);
		System.out.println("Count of special characters: " + c3);
	}

	public static void NthTerm() {
		int term = 3, a = 0, b = 1, c = 1, d = 0;
		System.out.print(a + "\t" + b + "\t" + c);
		while (d != 44) {
			d = a + b + c;
			a = b;
			b = c;
			c = d;
			term++;
			System.out.print("\t" + d);
		}
		System.out.print("\n 44 is: " + term + "th term");
	}

	public static void Print_specialcharacters() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		char c[] = new char[100];
		for (int i = 0; i < 100; i++) {
			c[i] = sc.next().charAt(0);
		}
		System.out.println("Special Characters are: ");
		for (int j = 0; j < c.length; j++) {
			if (!((int) c[j] >= 65 && (int) c[j] <= 90 || ((int) c[j] >= 97 && (int) c[j] <= 122)
					|| ((int) c[j] >= 48 && (int) c[j] <= 57))) {
				System.out.println(c[j]);
			}
		}
	}

	public static void Print_specialcharacters2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		for (int i = 1; i <= 20; i++) {
			char c = sc.next().charAt(0);
			if (!((int) c >= 65 && (int) c <= 90 || ((int) c >= 97 && (int) c <= 122)
					|| ((int) c >= 48 && (int) c <= 57))) {
				System.out.println("Special character :" + c);
			}
		}
	}
}
