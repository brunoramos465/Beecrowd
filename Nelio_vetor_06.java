package URI;

import java.util.Scanner;

public class Nelio_vetor_06{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] vetString = new String[n];
		int[] vetInt = new int[n];
		int cont = 0;
		String nome = "a";
			
		for(int i = 0; i < n; i++){
			vetString[i] = sc.next();
			vetInt[i] = sc.nextInt();
			
			if (vetInt[i] > cont ) {
				nome = vetString[i];
				cont = vetInt[i];
			}			
		}
		
		System.out.print("Pessoa mais velha: " + nome);

		
		
		sc.close();
	}
}