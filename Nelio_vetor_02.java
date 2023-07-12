package URI;

import java.util.Scanner;

public class Nelio_vetor_02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] vet = new int[n];
		int cont = 0;
			
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
			
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont = cont + 1;
			}
		}
		
		System.out.println();
		System.out.println(cont);

		sc.close();
	}
}
