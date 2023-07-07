package URI;

import java.util.Scanner;

public class Uri1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, resto, horas, minutos, segundos;
		
		N = sc.nextInt();
		
		horas = N / 3600; //1 minuto tem 60 segundos e 1 horas = 60 minutos = 3600 segundos
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}
}