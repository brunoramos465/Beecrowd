package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1041{
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();

		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if(x == 0){
			if (y > 0 || y < 0) {
				System.out.println("Eixo Y");
			}
				
		} else if(y == 0){
			if (x > 0 || x < 0) {
				System.out.println("Eixo X");
			}
				
		} else if(x >= 0.1) {
			if(y >= 0.1) {
				System.out.println("Q1");
			} else {
				System.out.println("Q4");
			}
		} else if(x <= 0) {
			if(y >= 0.1) {
				System.out.println("Q2");
			} else {
				System.out.println("Q3");
			}
		}
		
		
		sc.close();
	}
}