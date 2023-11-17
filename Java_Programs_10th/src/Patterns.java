import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		pattern_21a();
		pattern_21b();
		pattern_21c();
		pattern_21d();
	}

	public static void pattern_21a() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("$");
			System.out.println();
		}
	}

	public static void pattern_21b() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + "\t");
				a += 3;
			}
			System.out.println();
		}
	}

	public static void pattern_21c() {
		for (int i = 6; i >= 1; i--) {
			int a = 1, b = 1, c;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}
	}
	public static void pattern_21d() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		int n = sc.nextInt();
		int a=10,b=10,c=10;
		for (int i = 1; i <= n; i++) {
			a=b;
			for(int j=1;j<=5;j++) {
				System.out.print(a+"\t");
				a+=c;
			}
			System.out.println();
			b+=20;
			c+=10;
		}
	}

}
