import java.util.Scanner;

public class Incometax_details {

	public static void main(String[] args) {
		// Incometax();
		// Special_twodigit();
		// Number_operation();
		// Lead_Numbers();
		// Descending_Order();
		// Sixtieth_Term();
		// Odd_Numbers();
		//Pattern();
		Friendly_Amicable_Numbers();
	}

	public static void Incometax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name and taxable income: ");
		String na = sc.nextLine();
		double income = sc.nextDouble();
		double itax;
		if (income <= 150000)
			itax = income * 6 / 100.0;
		else
			itax = 1500 + (income - 150000) * 8 / 100.0;
		System.out.println("Name: " + na);
		System.out.println("Taxable income: Rs. " + income + "/-");
		System.out.print("Income tax: Rs. " + itax + "/-");
	}

	public static void Special_twodigit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a two digit integer: ");
		int n = sc.nextInt();
		if (n >= 10 && n <= 99) {
			int s = 0, p = 1, d1, d2, tot;
			d1 = n / 10;
			d2 = n % 10;
			s = d1 + d2;
			p = d1 * d2;
			tot = s + p;
			if (tot == n)
				System.out.print("Special two digit number");
			else
				System.out.print("Not a Special two digit number");
		} else
			System.out.print("Not a Special two digit number");
	}

	public static void Number_operation() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = sc.next().charAt(0);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (c >= 'a' && c <= 'z') {
			int t = a;
			a = b;
			b = t;
			System.out.println("First number: " + a);
			System.out.print("Second number: " + b);
		} else {
			double s = Math.sqrt(a % 10) + Math.sqrt(b % 10);
			System.out.print("Sum: " + s);
		}
	}

	public static void Lead_Numbers() {
		Scanner sc = new Scanner(System.in);
		int n, d, s1, s2;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter number: ");
			n = sc.nextInt();
			s1 = 0;
			s2 = 0;
			i = n;
			while (i > 0) {
				d = i % 10;
				if (d % 2 == 0)
					s1 = s1 + d;
				else
					s2 = s2 + d;
				i /= 10;
			}
			if (s1 == s2)
				System.out.println("Lead Number: " + n);
			else
				System.out.println("Not a lead number");
		}
	}

	public static void Descending_Order() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int nn = 0, j, d;
		for (int i = 9; i >= 0; i--) {
			j = n;
			while (j > 0) {
				d = j % 10;
				if (d == i)
					nn = nn * 10 + d;
				j /= 10;
			}
		}
		System.out.println("New number is: " + nn);
	}

	public static void Sixtieth_Term() {
		int a = 8, b = 7, c = 2;
		for (int i = 1; i <= 59; i++) {
			a += b;
			b += c;
			c += 4;
		}
		System.out.println("60 th term: " + a);
	}

	public static void Odd_Numbers() {
		int c = 0;
		for (int i = 1; c <= 25; i += 2) {
			if (!(i % 7 == 0)) // or i%7!=0
			{
				System.out.println(i);
				c++;
			}
		}
	}

	public static void Pattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		double a = sc.nextDouble();
		int b = 4, j, f;
		double p = 1, s;
		for (int i = 1; i <= 20; i++) {
			s = a;
			for (j = 2; j <= i + 1; j++)
				s += j;
			f = 1;
			for (int k = 1; k <= b; k++)
				f *= k;
			p *= s / f;
			b += 2;
		}
		System.out.println("p = " + p);
	}

	public static void Friendly_Amicable_Numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt(); // 220
		int b = sc.nextInt(); // 284
		int s = 0, i;
		for (i = 1; i <= a / 2; i++) // 110
		{
			if (a % i == 0) // 200%1==0
				s = s + i; // 284
		}
		if (s == b) {
			s = 0;
			for (i = 1; i <= b / 2; i++) // 142
			{
				if (b % i == 0) // 284%1==0
					s = s + i; // 220
			}
			if (s == a)
				System.out.println("Amicable numbers");
			else
				System.out.println("Not Amicable numbers");
		} else
			System.out.println("Not Amicable numbers");
	}
}
