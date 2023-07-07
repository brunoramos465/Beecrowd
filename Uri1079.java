package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for (int i = 0; i < n ;i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double res = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;
			
			System.out.printf("%.1f%n", res);
				
		}
		
		
		sc.close();
	}
}