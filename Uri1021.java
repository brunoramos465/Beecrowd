package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n;
		int resto, quociente, valor,moeda;
			
		n = sc.nextDouble();
		resto = (int) (n * 100.00 + 0.05);
		
		System.out.println("NOTAS:");

		valor = 100;
		quociente = resto / (valor *100);
		System.out.println(quociente + " nota(s) de R$ " + valor + (".00"));
		resto = resto % (valor *100);
		
		valor = 50;
		quociente = resto / (valor *100);
		System.out.println(quociente + " nota(s) de R$ " + valor + (".00"));
		resto = resto % (valor *100);
		
		valor = 20;
		quociente = resto / (valor *100);
		System.out.println(quociente + " nota(s) de R$ " + valor + (".00"));
		resto = resto % (valor *100);
                
        valor = 10;
		quociente = resto / (valor *100);
		System.out.println(quociente + " nota(s) de R$ " + valor + (".00"));
		resto = resto % (valor *100);
		
		valor = 5;
		quociente = resto / (valor *100);
		System.out.println(quociente + " nota(s) de R$ " + valor + (".00"));
		resto = resto % (valor *100);
		
		valor = 2;
		quociente = resto / (valor *100);
		System.out.println(quociente + " nota(s) de R$ " + valor + (".00"));
		resto = resto % (valor *100);
        
        System.out.println("MOEDAS:");
        
        moeda = 100;
        quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
        resto = resto % moeda;
        
        moeda = 50;
        quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50" );
        resto = resto % moeda;
        
        moeda = 25;
        quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25" );
        resto = resto % moeda;
        
        moeda = 10;
        quociente = resto / valor;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
        resto = resto % moeda;
        
        moeda = 5;
        quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
        resto = resto % moeda;
        
		System.out.println(resto + " moeda(s) de R$ 0.01");
			
		sc.close();
	}
}