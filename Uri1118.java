package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1118{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double nota1 = 0;
		int fim = 0;
		
		
		
		while (fim !=2) {
			if (x < 0 || x > 10) {
				System.out.println("nota invalida");
				x = sc.nextDouble();
			} else {
				if (nota1 > 0) {
					System.out.printf("media = %.2f%n",(nota1+x)/2);
					System.out.println("novo calculo (1-sim 2-nao)");
					fim = sc.nextInt();
					while (fim != 2 && fim != 1) {
						System.out.println("novo calculo (1-sim 2-nao)");
						fim = sc.nextInt();	
					}
					if (fim == 1) {
						x = 0;
						nota1 = 0;
						x = sc.nextDouble();
					}
					
				} else {
					nota1 += x;
					x = sc.nextDouble();
				}
			}			
		}
				
		sc.close();
		
	}
}