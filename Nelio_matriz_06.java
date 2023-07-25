package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_matriz_06{
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[][] matriz = new double[n][n];
		double positivos = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		int linhaEscolhida = sc.nextInt();
		int colunaEscolhida = sc.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] > 0) {
					positivos = matriz[i][j] + positivos;
				}		
			}
		}
		
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n",positivos);
		
		System.out.print("LINHA ESCOLHIDA:");
		for(int j = 0; j < n; j++) {
			System.out.print(" " + matriz[linhaEscolhida][j]);
		}
		System.out.println();

		
		System.out.print("COLUNA ESCOLHIDA:");
        for(int i = 0; i < n; i++) {
			System.out.print(" " + matriz[i][colunaEscolhida]);
		}
        System.out.println();
        
        System.out.print("DIAGONAL PRINCIPAL:");
        for(int i = 0; i < n; i++) {
    		System.out.print(" " + matriz[i][i]);
        }
        System.out.println();        
 
        System.out.println("MATRIZ ALTERADA:");        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(matriz[i][j] < 0.0) {
        			matriz[i][j] = Math.pow(matriz[i][j], 2);
        		}
        		System.out.print(matriz[i][j] + " ");
        	}
        	System.out.println();
        }
      	
		sc.close();
	}
}