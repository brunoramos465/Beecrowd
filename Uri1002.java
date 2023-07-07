package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area;
		double N = 3.14159;

		area = sc.nextDouble();
		area = N * Math.pow(area, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}
}