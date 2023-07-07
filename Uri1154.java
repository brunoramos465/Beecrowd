package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1154{
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt() ;
		double media = 0,acum = 0;
		
		while (x >= 0) {
			acum = acum + x;
			media = media + 1;
			x = sc.nextInt();

		}
		
		System.out.printf("%.2f%n", (double)acum/media);
		
		
		sc.close();
	}
}