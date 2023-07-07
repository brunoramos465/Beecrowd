package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1045{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,CB,CB2,A2,B2,C2;
		double A1,B1,C1;
				
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		A1 = A;
		B1 = B;
		C1 = C;
			
		if (A >= C && C >= B) {
			B1 = C;
			C1 = B; 			
		} else if(C >= A && A >= B) {
			A1 = C;
			B1 = A;
			C1 = B;
		} else if(C >= B && B >= A) {
			A1 = C;
			C1 = A;
		} else if(B >= A && A >= C) {
			A1 = B;
			B1 = A;
		} else if(B >= C && C >= A) {
			A1 = B;
			B1 = C;
			C1 = A;
		}
		
		CB = B1 + C1;
	
		A2 = Math.pow(A1, 2.0);
		B2 = Math.pow(B1, 2.0);
		C2 = Math.pow(C1, 2.0);
		CB2 = B2 + C2;
		
		
		if (A1 >= CB) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if (A2 == CB2) {
			System.out.println("TRIANGULO RETANGULO");
		} else if (A2 > CB2) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if (A2 < CB2) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		

	    if (A1 == B1 && B1 == C1){
			System.out.println("TRIANGULO EQUILATERO");
		} else if (A1 == B1 || A1 == C1 || B1 == A1 || B1 == C1 || C1 == A1 || C1 == B1){
			System.out.println("TRIANGULO ISOSCELES");
		}
	    	
		sc.close();
	}
}