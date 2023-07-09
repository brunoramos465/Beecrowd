package URI;

import java.util.Scanner;

public class Uri1101{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int soma = 0;
		
		while (m > 0 && n > 0) {
			int maior = n, menor = m;

			if (m > n) {
				maior = m;
				menor = n;
			} 
				
			for (int i = menor ; i <= maior; i++ ) {
				System.out.print(i + " ");	
				soma = soma + i;
			}
			System.out.println("Sum="+soma);
			
			m = sc.nextInt();
			n = sc.nextInt();
			soma = 0;
		}
		
		sc.close();
	}
}