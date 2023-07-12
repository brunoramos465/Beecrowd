package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_vetor_01{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vet = new double [n];
		double max = 0;
		int saida = 0;
		
		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
			
			if (vet[i] > max) {
				max = vet[i];
				saida = i;
			}
			
		}
		
		System.out.printf("%.1f%n", max);
		System.out.println(saida);
		
	
		
		sc.close();
	}
}
