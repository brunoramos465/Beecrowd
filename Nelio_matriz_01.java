package URI;

import java.util.Scanner;

public class Nelio_matriz_01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] numeros = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");	
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(numeros[i][j] < 0) {
					System.out.println(numeros[i][j]);
				}
			}
		}
		
		
		sc.close();
	}
}