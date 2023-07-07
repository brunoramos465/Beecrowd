package URI;

import java.util.Scanner;

public class Uri1020{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, ano, mes, quocienteAno,quocienteMes,quocienteDia,resto;
		
		idade = sc.nextInt();
		ano = 365;
		mes = 30;
		resto = idade;
		
		
		quocienteAno = resto / ano;
		resto = resto % ano;
		
		quocienteMes = resto / mes;
		resto = resto % mes;
		
		quocienteDia = resto;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", quocienteAno, quocienteMes, quocienteDia);	
		
		sc.close();
	}
}