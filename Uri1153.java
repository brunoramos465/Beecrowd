package URI;

import java.util.Scanner;

public class Uri1153{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = x;

		for (int i = x - 1; i > 0; i--) {	
			soma = soma * i;	
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}