package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String name = sc.next();
		double fixo = sc.nextDouble(); 
		double sell = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f%n", (((sell * 15)/ 100) + fixo));
			
		sc.close();
	}
}