import java.util.Scanner;

public class EvenOdd_Factors {
	public static void main(String[] args) {
		// evenoddfactors();
		// composite();
		// pronic();
		// pronic2();
		// magic_numbers();
		// InputNumbers_19a();
		// InputNumbers_19b();
		// InputNumbers_19c();
		// InputNumbers_19d();
		Odd_Palindrome();
	}

	public static void evenoddfactors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int p = 1, s = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 == 1)
				p = p * i;
			else if (n % i == 0 && i % 2 == 0)
				s = s + i;
		}
		System.out.println("Product of odd factors = " + p);
		System.out.println("Sum of even factors = " + s);
	}

	public static void composite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (n != 1 && flag == false)
			System.out.println("Composite");
		else
			System.out.println("Not Composite");
	}

	public static void pronic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt(); // 25
		boolean flag = false;
		for (int i = 1; i <= n / 2; i++) {
			if (i * (i + 1) == n) {
				flag = true;
				break;
			}
		}
		if (flag == true)
			System.out.println("Pronic");
		else
			System.out.println("Not Pronic");
	}

	public static void pronic2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt(); // 20
		int x = (int) Math.sqrt(n); // 4
		if (x * (x + 1) == n) // 20==20
			System.out.println("Pronic");
		else
			System.out.println("Not Pronic");
	}

	public static void magic_numbers() {
		int s, d;
		for (int n = 100; n <= 999; n++) // to generate 3 digit numbers
		{
			int i = n;
			do {
				s = 0;
				while (i > 0) {
					d = i % 10;
					s = s + d;
					i = i / 10;
				}
				i = s;
			} while (s >= 10);
			if (s == 1)

				System.out.println(n);
		}
	}

	public static void InputNumbers_19a() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of numbers");
		int n = sc.nextInt();
		long p = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number : ");
			int num = sc.nextInt();
			int j = num, d, largest = 0;
			while (j > 0) {
				d = j % 10;
				if (d > largest)
					largest = d;
				j = j / 10;

			}
			p = p * (largest * largest);
		}
		System.out.println("Product of squares of largest digits : " + p);
	}

	public static void InputNumbers_19b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of numbers");
		int n = sc.nextInt();
		long p = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number : ");
			int num = sc.nextInt();
			System.out.println("Square root of " + num + ": " + Math.sqrt(num));
		}
	}

	public static void InputNumbers_19c() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of numbers");
		int n = sc.nextInt();
		long p = 1;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number : ");
			int num = sc.nextInt();

			if (num >= 100 && num <= 999 && num > 0 && num % 6 == 0)
				c++;
		}
		System.out.println("Count of all 3 digit positive numbers divisible by 6 : " + c);
	}

	public static void InputNumbers_19d() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of numbers");
		int n = sc.nextInt();
		long p = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter number : ");
			int num = sc.nextInt();
			int k = num, d, lar = 0, sm = 9;
			while (k > 0) {
				d = k % 10;
				if (d > lar)
					lar = d;
				if (d < sm)
					sm = d;
				k /= 10;
			}
			System.out.println("Largest : " + lar);
			System.out.println("Smallest : " + sm);
		}
	}

	public static void Odd_Palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int i = n, d, rev = 0;
		while (i > 0) {
			d = i % 10;
			rev = rev * 10 + d;
			i = i / 10;
		}
		if (rev == n && n % 2 == 1)
			System.out.println("Odd Palindrome");
		else
			System.out.println("Not an odd Palindrome");
	}

}
