package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		double soma = 0, giro = 0;
		
		while (giro < 2.0) {
			x = sc.nextDouble();
			if(x >= 0.0 && x <= 10.0) {
				giro = giro + 1.0;
				soma += x;
			} else {
				System.out.println("nota invalida");
			}
		}
		
		System.out.printf("media = %.2f%n", (soma / 2));
		
	
		sc.close();
	}
}