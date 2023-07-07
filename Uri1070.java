package URI;

import java.util.Scanner;

public class Uri1070{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int A = 0,B = 0,C = 0,D = 0,E = 0, PAR;
		
		PAR = X % 2;
	
		if (PAR == 0) {
			 X += 1;
			 A += (X + 2);
			 B += (A + 2);
			 C += (B + 2);
			 D += (C + 2);
			 E += (D + 2);	
		} else {
			 A += (X + 2);
			 B += (A + 2);
			 C += (B + 2);
			 D += (C + 2);
			 E += (D + 2);	
		}
		
		System.out.println(X);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);

		sc.close();
	}
}