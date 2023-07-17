package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_vetor_05{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] vet = new int [n];  
		double soma = 0;
		int cont = 0;
		
		for(int i = 0; i < n; i++) {
			 vet[i] = sc.nextInt();
			 
			 if(vet[i] % 2 == 0) {
				 soma = vet[i] + soma;
				 cont = cont + 1;
			 }
		}
		
		System.out.printf("%.1f%n",soma/cont);
		
		sc.close();
	}
}