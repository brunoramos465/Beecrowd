package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_vetor_08{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] altura = new double[n];
		String[] sexo = new String[n];
		double menorAltura = 0.0;
		double maiorAltura = 0.0;
		double alturaF = 0.0;
		int contF = 0;
		int contM = 0;
	
		for(int i = 0; i < n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next();
			menorAltura = altura[i];
		}
		
		for(int i = 0; i < n; i++) {	
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(sexo[i].equals("F")){
				alturaF = altura[i] + alturaF;
				contF = 1 + contF;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(sexo[i].equals("M")) {
				contM = 1 + contM;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n",menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", alturaF/contF);
		System.out.println("Numero de homens = " + contM);
		
		sc.close();
	}
}