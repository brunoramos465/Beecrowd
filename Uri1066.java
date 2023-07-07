package URI;

import java.util.Scanner;

public class Uri1066{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,E,PAR = 0,IMPAR = 0, POSITIVO = 0,NEGATIVO = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		
	
	
		if ((A % 2) == 0) {
			PAR += 1;
		} else {
			IMPAR += 1;
		}	
		
		if ((B % 2 ) == 0) {
			PAR += 1;
		} else {
			IMPAR += 1;
		}	
		 	
		if ((C % 2) == 0) {
			PAR += 1;
		} else {
			IMPAR += 1;
		}
		
		
		if ((D % 2) == 0) {
			PAR += 1;
		} else {
			IMPAR += 1;
		}
		 
	
		if ((E % 2) == 0) {
			PAR += 1;
		} else {
			IMPAR += 1;
		}
		
		
		if (A > 0) {
			POSITIVO += 1;
		} else if (A < 0){
			NEGATIVO += 1;
		}
		
		if (B > 0) {
			POSITIVO += 1;
		} else if (B < 0){
			NEGATIVO += 1;
		}
		
		if (C > 0) {
			POSITIVO += 1;
		} else if (C < 0){
			NEGATIVO += 1;
		}
		
		if (D > 0) {
			POSITIVO += 1;
		} else if (D < 0){
			NEGATIVO += 1;
		}
		
		if (E >= 0) {
			POSITIVO += 1;
		} else if (E < 0){
			NEGATIVO += 1;
		}
		
		
		System.out.println(PAR + " valor(es) par(es)");
		System.out.println(IMPAR + " valor(es) impar(es)");
		System.out.println(POSITIVO + " valor(es) positivo(s)");
		System.out.println(NEGATIVO + " valor(es) negativo(s)");

	
		sc.close();
	}
}