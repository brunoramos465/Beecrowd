package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_vetor_04{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] vet = new double[n];
		double soma = 0.0;
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
			soma = vet[i] + soma;	
		}
		System.out.println(soma/n);
		
		for(int i= 0; i < n; i++) {
			if(vet[i] < soma/n) {
				System.out.printf("%.1f%n",vet[i]);
			}
		}


	
			
		sc.close();
	}
}
