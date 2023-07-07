package URI;

import java.util.Scanner;

public class Uri1131{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int inter, gremio;
		int vitInter = 0, vitGremio = 0,empates = 0,resp = 0;
		int grenais = 0;
		
		inter = sc.nextInt();
		gremio = sc.nextInt();
		
		while(resp != 2) {
			
			if (inter > gremio) {
				vitInter = vitInter + 1;
				grenais = grenais + 1;
				System.out.println("Novo grenal (1-sim 2-nao)");
				resp = sc.nextInt();
				if (resp == 1 ) {
					inter = sc.nextInt();
					gremio = sc.nextInt();
				}
			} else if(inter < gremio) {
				grenais = grenais + 1;
				vitGremio = vitGremio + 1;
				System.out.println("Novo grenal (1-sim 2-nao)");
				resp = sc.nextInt();
				if (resp == 1 ) {
					inter = sc.nextInt();
					gremio = sc.nextInt();
				}
			} else if (inter == gremio) {
				grenais = grenais + 1;
				empates = empates + 1;
				System.out.println("Novo grenal (1-sim 2-nao)");
				resp = sc.nextInt();
				if (resp == 1 ) {
					inter = sc.nextInt();
					gremio = sc.nextInt();
				}
			}	
			
		}
		
		if (resp == 2) {
			System.out.println(grenais + " grenais");
			System.out.println("Inter:" + vitInter);
			System.out.println("Gremio:" + vitGremio);
			System.out.println("Empates:" + empates);
			if(vitInter > vitGremio) {
				System.out.println("Inter venceu mais");
			} else if ( vitInter < vitGremio) {
				System.out.println("Gremio venceu mais");
			} else if (vitInter == vitGremio) {
				System.out.println("Nao houve vencedor");
			}
			
	
		}
		
		sc.close();
	}
}