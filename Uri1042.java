package URI;

import java.util.Scanner;

public class Uri1042{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C;
		int AA = 0,BB = 0,CC = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		
		if (A > B && B > C) {
			AA = A;
			BB = B;
			CC = C;			
		}
		if (B > A && A > C) {
			AA = B;
			BB = A;
			CC = C;
		}	
		if(A > C && C > B) {
			AA = A;
			BB = C;
			CC = B;
		}
		if (C > A && A > B) {
			AA= C ;
			BB= A;
			CC= B;
		}
		
		if (B > C && C > A) {
			AA= B;
			BB= C;
			CC= A;
		}
		if (C > B && B > A) {
			AA= C;
			BB= B;
			CC= A;
		}
		
		System.out.println(CC);
		System.out.println(BB);
		System.out.println(AA);
		System.out.println();
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);


		sc.close();
	}
}