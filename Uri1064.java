package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1064{
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,D,E,F,MEDIA = 0;
		int SOMA = 0;
		
		 A = sc.nextDouble();
		 B = sc.nextDouble();
		 C = sc.nextDouble();
		 D = sc.nextDouble();
		 E = sc.nextDouble();
		 F = sc.nextDouble();
		
		if (A > 0) {
			SOMA += 1;
			MEDIA += A;
		} 
		 if (B > 0){
			SOMA += 1;
			MEDIA += B;
		} 
		 if (C > 0) {
			SOMA += 1;
			MEDIA += C;
		} 
		 if (D > 0) {
			SOMA += 1;
			MEDIA += D;
		} 
		 if (E > 0) {
			SOMA += 1;
			MEDIA += E;
		} 
		 if (F > 0) {
			SOMA += 1;
			MEDIA += F;
		}
		
		System.out.println(SOMA + " valores positivos");
		System.out.printf("%.1f%n", (MEDIA/SOMA));

		sc.close();
	}
}