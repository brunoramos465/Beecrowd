package URI;

import java.util.Scanner;

public class Uri1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio,fim,calculo;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		
		if (inicio > fim) {
			calculo = (1440 -((inicio * 60)-(fim * 60)))/60; 
			System.out.println("O JOGO DUROU " + calculo + " HORA(S)");
		} else if (fim > inicio) {
			calculo = ((fim * 60) - (inicio * 60))/60 ;
			System.out.println("O JOGO DUROU " + calculo + " HORA(S)");
		} else if (inicio == fim) {
			System.out.printf("O JOGO DUROU 24 HORA(S)%n");
		}
			
		sc.close();
	}
}