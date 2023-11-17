import java.util.Scanner;

public class netpay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price: ");
		int price = sc.nextInt();
		System.out.println("Enter quantity: ");
		int qty = sc.nextInt();
		amount(price, qty);
	}

	public static void amount(int price, int quantity) {
		double totalamount, discount, netpayamount;
		totalamount = quantity * price;
		discount = totalamount * 0.05;
		netpayamount = totalamount - discount;
		System.out.println("Total price : "+totalamount);
		System.out.println("Netpay after 5% discount : "+netpayamount);
	}

}
