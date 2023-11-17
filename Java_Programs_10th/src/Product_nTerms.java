import java.util.*;

public class Product_nTerms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		long a = 1, b = 2, p = 1;
		for (int i = 1; i <= n; i++) 
		{
			p = p * a;
			a = a * 10 + b++;
		}
		System.out.println("Product: " + p);

	}

}
