package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1143{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			double n2,n3;
			
			n2 = Math.pow(i, 2.0);
			n3 = Math.pow(i, 3.0);
			
			System.out.println(i + " " + (int)n2 + " " + (int)n3);		

		}
		
		
		sc.close();
	}
}