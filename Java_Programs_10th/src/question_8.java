
public class question_8 {

	public static void main(String[] args) {
		
		int i,j,s,c=0;
		System.out.println("Perfect Numbers");
		for(i=10;i<=1000;i++) {
			s=0;
			for(j=1;j<=i/2;j++) {
				if(i%j==0)
					s+=j;
			}
			if(s==i)
			{
				System.out.println(i+"\t");
				c++;
			}
		}
		System.out.println("Count of perfect numbers="+c);
		
	}

}
