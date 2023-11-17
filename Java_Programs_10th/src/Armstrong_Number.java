import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int i=number,n=number;
		int count=0,digit,digitcount,j,sum=0;
		while (n != 0) {
            count++;
            n = n / 10;
        }
		while(i>0)
		{
			digit=i%10;
			digitcount=digit;
			for(j=1;j<count;j++)
			{
				digit=digit*digitcount;
			}
			sum=sum+digit;
			i/=10;
		}
		if(number==sum)
		{
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
	}

}
