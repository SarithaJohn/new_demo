import java.util.Scanner;

public class studentReport {

	public static void main(String[] args) {
		double sub1, sub2, sub3, sub4, sub5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name: ");
		String name = sc.next();
		System.out.println("Enter marks scored in 5 subjects: ");
		sub1 = sc.nextDouble();
		sub2 = sc.nextDouble();
		sub3 = sc.nextDouble();
		sub4 = sc.nextDouble();
		sub5 = sc.nextDouble();
		grade(sub1, sub2, sub3, sub4, sub5, name);
	}

	public static void grade(double m1, double m2, double m3, double m4, double m5, String name) {
		double total_mark, percentage;
		total_mark = m1 + m2 + m3 + m4 + m5;
		percentage = total_mark / 5;
		System.out.println("Student Report");
		System.out.println("Student Name: " + name);
		System.out.println("Marks");
		System.out.println("Subject1: " + m1);
		System.out.println("Subject2: " + m2);
		System.out.println("Subject3: " + m3);
		System.out.println("Subject4: " + m4);
		System.out.println("Subject5: " + m5);
		System.out.println("Total Marks: " + total_mark);
		System.out.println("Percentage: " + percentage + "%");
		if (percentage > 90) {
			System.out.println("Grade: A+");
		} else if (percentage >= 80 && percentage <= 90) {
			System.out.println("Grade: B+");
		} else {
			System.out.println("Grade: C");
		}
	}

}
