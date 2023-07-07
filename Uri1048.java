package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = 0;
		double novoSalario = 0;
		double percentual = 0;
		double reajuste = 0;
		
		salario = sc.nextDouble();
		
		if (salario <= 400.00){
			novoSalario = salario + (salario * 0.15);
		    percentual = 15;
		    reajuste = novoSalario - salario;
		} else if (salario <= 800.00) {
			novoSalario = salario + (salario * 0.12);
		    percentual = 12;
		    reajuste = novoSalario - salario;
		} else if (salario <= 1200.00) {
			novoSalario = salario + (salario * 0.10);
			percentual = 10;
		    reajuste = novoSalario - salario;
		} else if (salario <= 2000.00) {
			novoSalario = salario + (salario * 0.07);
			percentual = 7;
		    reajuste = novoSalario - salario;
		} else if (salario > 2000.00 ) {
			novoSalario = salario + (salario * 0.04);
			percentual = 4;
		    reajuste = novoSalario - salario;
		}
		
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.println("Em percentual: " +  (int)percentual+" %");
		
		sc.close();
	}
}