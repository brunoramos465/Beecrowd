package URI;

import java.util.Scanner;

public class Uri1065{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,E,PAR = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		
	
		if ((A % 2) == 0) {
			PAR += 1;
		} 
		if ((B % 2 ) == 0) {
			PAR += 1;
		}
		if ((C % 2) == 0) {
			PAR += 1;
		}
		if ((D % 2) == 0) {
			PAR += 1;
		}
		if ((E % 2) == 0) {
			PAR += 1;
		}
		
		System.out.println(PAR + " valores pares");

		
		sc.close();
	}
}