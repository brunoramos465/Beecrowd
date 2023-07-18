package URI;

import java.util.Locale;
import java.util.Scanner;

public class Nelio_vetor_09{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] produto = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		double[] lucro = new double[n];
		double totalCompra = 0.0;
		double totalVenda = 0.0;
		double totalLucro = 0.0;
		int lucro10 = 0;
		int lucro10e20 = 0;
		int lucroMaior20 = 0;
		
		for(int i = 0; i < n; i++) {	
			produto[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();	
			lucro[i] = venda[i] - compra[i];
			totalCompra = totalCompra + compra[i];
			totalVenda = totalVenda + venda[i];
			totalLucro = totalLucro + lucro[i];
		}
		
		for(int i = 0; i < n; i++) {
			if (venda[i] < compra[i] * 0.10 + compra[i]) {
				lucro10 = lucro10 + 1;
			}
			
			if(venda[i] >= compra[i] * 0.10 + compra[i] && venda[i] <= compra[i] * 0.20 + compra[i]) {
				lucro10e20 = lucro10e20 + 1;
			}
			
			if(venda[i] >= compra[i] * 0.20 + compra[i]) {
				lucroMaior20 = lucroMaior20 + 1;
			}
		}
			
		System.out.println("Lucro abaixo de 10%: " + lucro10);
		System.out.println("Lucro entre 10% e 20%: " + lucro10e20);
		System.out.println("Lucro acima de 20%: " + lucroMaior20);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
		
		sc.close();
	}
	
}