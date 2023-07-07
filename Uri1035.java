package URI;

import java.util.Scanner;

public class Uri1035 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D; 
		int CD, AB,PAR;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		CD = C + D;
		AB = A + B;
		
		PAR = A%2;
		
		if (B > C && D > A && CD > AB && CD > C && CD > D){
			if (PAR == 0) {
				   System.out.println("Valores aceitos");
			} else {
				System.out.println("Valores nao aceitos");
			}
		}else{
			System.out.println("Valores nao aceitos");
		}				
		sc.close();
	}
}