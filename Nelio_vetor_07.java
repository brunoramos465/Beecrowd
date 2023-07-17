package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_vetor_07{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] notaUm = new double[n];
		double[] notaDois = new double[n];
		double[] media = new double[n];

		for(int i = 0; i < n; i++) {	
			nome[i] = sc.next();
			notaUm[i] = sc.nextDouble();
			notaDois[i] = sc.nextDouble();				
		}
		
		System.out.println("Alunos aprovados:");
		
		for(int i = 0; i < n; i++) {
			media[i] = (notaUm[i] + notaDois[i]) / 2.0;

			if (media[i] >= 6.0) {
				System.out.println(nome[i]);
			}	
		}
		
		
		
		sc.close();
	}
}