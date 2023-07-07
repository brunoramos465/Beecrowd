package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employee = sc.nextInt();
		int hours = sc.nextInt();
		double salary = sc.nextDouble();
				
		System.out.println("NUMBER = " + employee);
		System.out.printf("SALARY = U$ %.2f%n", salary * hours);
		
		sc.close();
	}
}