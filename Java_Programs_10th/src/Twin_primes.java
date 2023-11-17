import java.util.*;

public class Twin_primes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
/* sample program */
		System.out.println("Enter the two numbers");
		int a = sc.nextInt(); // 7
		int b = sc.nextInt(); // 5

		if (a - b == -2 || a - b == 2) // To check whether two numbers differ by 2 or not
		{
			int i, c = 0;
			for (i = 1; i <= a; i++) // To check whether 1st number is prime or not
			{
				if (a % i == 0)
					c++;
			}
			if (c == 2) {
				c = 0;
				for (i = 1; i <= b; i++) // To check whether 1st number is prime or not
				{
					if (b % i == 0)
						c++;
				}
				if (c == 2)
					System.out.println("Twin Prime");
				else // If 2nd number is not prime
					System.out.println("Not Twin Prime");
			} else // If 1st number is not prime
				System.out.println("Not Twin Prime");
			// If difference between two numbers is not 2
		} else
			System.out.println("Not Twin Prime");

	}

}
