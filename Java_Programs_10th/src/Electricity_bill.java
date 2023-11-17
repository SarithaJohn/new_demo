import java.util.Scanner;

public class Electricity_bill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of customers"); 
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		System.out.println("Enter name: ");
		String na=sc.next();
		System.out.println("Enter previous reading: ");
		int prv = sc.nextInt();
		System.out.println("Enter present reading: ");
		int prs = sc.nextInt(); 
		int units=prs-prv; 
		double charge;
		if(units<=50) 
			charge=0.0;
		else if(units<=150) 
			charge=0+(units-50)*2.25;
		else if(units<=350) 
			charge=0+100*2.25+(units-150)*3.45;
		else 
			charge=0+100*2.25+200*3.45+(units-350)*4.2;
		System.out.println("Name: "+na); 
		System.out.println("Present Reading: "+prs); 
		System.out.println("Previous Reading: "+prv); 
		System.out.println("Units: "+units); 
		System.out.println("Charge: Rs."+ charge+ "/-");
		}

	}

}
