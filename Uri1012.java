package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", (A * C)/2);
		System.out.printf("CIRCULO: %.3f%n", (Math.pow(C, 2)) * 3.14159);
		System.out.printf("TRAPEZIO: %.3f%n", ((A + B)* C)/ 2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(B, 2));
		System.out.printf("RETANGULO: %.3f%n", A * B);
		
		sc.close();
	}
}