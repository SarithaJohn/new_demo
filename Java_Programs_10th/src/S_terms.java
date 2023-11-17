import java.util.Scanner;

public class S_terms 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for X");
		double X = sc.nextDouble();
		int a = 3, b = 3, sign = -1;
		double S = 1;
		for (int i = 1; i <= 10; i++) 
		{
			S = S + a * Math.pow(X, b) * sign;
			a = a + 2;
			b = b * 10 + 3;
			sign = -sign;
		}
		System.out.println("S = " + S);
	}
}
