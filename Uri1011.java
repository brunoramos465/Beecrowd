package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R = sc.nextDouble();
		
		System.out.printf("VOLUME = %.3f%n", ((4.0/3) * 3.14159 * Math.pow(R, 3)));
		
		sc.close();
	}
}
