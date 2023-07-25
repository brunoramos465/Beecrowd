package URI;

import java.util.Scanner;

public class Nelio_matriz_07{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] vetor = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				vetor[i][j] = sc.nextInt();
			}
		}
		
		int fila = sc.nextInt();
		
		fila = fila - 1;
		
		int ultimoFila = vetor[fila][n - 1];
		
		for (int j = n - 1; j > 0; j--) {
			vetor[fila][j] = vetor[fila][j-1];
		}
		
		vetor[fila][0] = ultimoFila;
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(vetor[i][j] + " ");
			}
			System.out.println();
		}	
		
		sc.close();
	}
}