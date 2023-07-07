package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1051{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double novoSalario,novoSaldo = salario, imposto4 = 0, imposto3 = 0,imposto2 = 0,imposto;
		
			
		
			if (novoSaldo > 4500.00 ) {
				novoSalario =  novoSaldo - 4500 ;
				imposto4 = novoSalario * 0.28;
				novoSaldo = salario - novoSalario;
			} 
			if ( novoSaldo > 3000.00  ) {
				novoSalario =  novoSaldo - 3000;
				imposto3 = novoSalario * 0.18;
				novoSaldo -= novoSalario;
			} 
			if (novoSaldo > 2000.00) {
				novoSalario = novoSaldo - 2000;
				imposto2 = novoSalario * 0.08;
				novoSaldo -= novoSalario;		
			}
		
		imposto = imposto4 + imposto3 + imposto2;
		
		if (imposto <= 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n",imposto);

		}
			
		sc.close();
	}
}