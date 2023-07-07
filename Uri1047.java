package URI;

import java.util.Scanner;

public class Uri1047 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int inicioMinuto = sc.nextInt();
		int fim = sc.nextInt();
		int fimMinuto = sc.nextInt();
		double horas,minutos;
		
		horas = fim - inicio;
		
		minutos = fimMinuto - inicioMinuto;
		
		if (minutos < 0) {
			minutos +=60;
			horas -=1;
		}
		if (horas < 0) {
			horas += 24;
		}
		
		
		if (minutos == 0 && horas == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
	
		} else {
			System.out.printf("O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)%n",horas,minutos);

		}
				
				
		
			
		
		sc.close();
	}
}