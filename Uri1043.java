package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
	
			
		if ( A == B && A == C) {
		    System.out.printf("Perimetro = %.1f%n", A + B + C);
		} else if (A > B && A > C) {
			if (A < (B + C)) {
			    System.out.printf("Perimetro = %.1f%n", A + B + C);
			} else {
			    System.out.printf("Area = %.1f%n", ((A + B) * C)/2);
			}
		}else if (B > A && B > C) {
			if (B < (A + C) ) {
				System.out.printf("Perimetro = %.1f%n", A + B + C);
			} else {
				System.out.printf("Area = %.1f%n", ((A + B) * C)/2);
			}
		} else if (C > B && C > A) {
			if (C < (A + B) ) {
				System.out.printf("Perimetro = %.1f%n", A + B + C);
			}else {
				System.out.printf("Area = %.1f%n", ((A + B) * C)/2);
			}
		} else {
			System.out.printf("Area = %.1f%n", ((A + B) * C)/2);
		}
		
		sc.close();
	}
}