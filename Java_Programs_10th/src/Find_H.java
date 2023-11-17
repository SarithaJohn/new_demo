
public class Find_H {

	public static void main(String[] args) {

		int a = 4;
		double H = 0.0;
		for (int i = 2; i <= 11; i++) {
			long s = 0, f = 1;
			for (int j = 1; j <= i; j++)
				s = s + j;
			for (int j = 1; j <= a; j++)
				f = f * j;
			H = H + s / f;
			a = a + 4;
		}
		System.out.println("H = " + H);
	}

}
