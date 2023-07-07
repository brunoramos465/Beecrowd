package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1060{
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,D,E,F;
		int SOMA = 0;
		
		 A = sc.nextDouble();
		 B = sc.nextDouble();
		 C = sc.nextDouble();
		 D = sc.nextDouble();
		 E = sc.nextDouble();
		 F = sc.nextDouble();
		
		if (A > 0) {
			SOMA += 1;
		} 
		 if (B > 0){
			SOMA += 1;
		} 
		 if (C > 0) {
			SOMA += 1;
		} 
		 if (D > 0) {
			SOMA += 1;	
		} 
		 if (E > 0) {
			SOMA += 1;
		} 
		 if (F > 0) {
			SOMA += 1;
		}
		
		System.out.println(SOMA + " valores positivos");

		sc.close();
	}
}