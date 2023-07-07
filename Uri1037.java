package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if(numero < 0) {
			System.out.println("Fora de intervalo"); 
		}else if (numero < 25.00001 ){
			System.out.println("Intervalo [0,25]"); 
		} else if (numero < 50.000001) {
			System.out.println("Intervalo (25,50]"); 

		} else if (numero < 75.000001) {
			System.out.println("Intervalo (50,75]"); 

		} else if (numero < 100.000001) {
			System.out.println("Intervalo (75,100]"); 

		} else if (numero > 100.000001) {
			System.out.println("Fora de intervalo"); 
		} 
		
		sc.close();
		
	}
}