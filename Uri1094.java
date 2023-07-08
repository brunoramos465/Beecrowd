package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1094{
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int quantia = 0, c = 0,r = 0, s = 0,total =0; 
		char tipo;

		
		for (int i = 0; i < n; i++) {
			quantia = sc.nextInt();
			tipo = sc.next().charAt(0);
			
			if (tipo == 'C'){
				c = quantia + c;
			} 
			if (tipo == 'R') {
				r = quantia + r;
			}
			if (tipo == 'S') {
				s = quantia + s;
			}
			total = total + quantia;		
		}
		
	
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.printf("Percentual de coelhos: %.2f %%%n",((double)c/total)*100.00);
		System.out.printf("Percentual de ratos: %.2f %%%n",((double)r/total)*100.00);
		System.out.printf("Percentual de sapos: %.2f %%%n",((double)s/total)*100.00);
		
		sc.close();
	}
}