package URI;

import java.util.Scanner;

public class Uri1061{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;		
		int w1,x1,y1,z1,w2,x2,y2,z2;
		int resto, duracao, inicio,fim, w,x,y,z;
		
		s = sc.next();
		w1 = sc.nextInt();
		
		x1 = sc.nextInt();
		s = sc.next();

		y1 = sc.nextInt();
		s = sc.next();

		z1 = sc.nextInt();
		s = sc.next();

		w2 = sc.nextInt();
		
		x2 = sc.nextInt();
		s = sc.next();

		y2 = sc.nextInt();
		s = sc.next();

		z2 = sc.nextInt();
		
						
		inicio =  w1*24*60*60 + x1*60*60 + y1*60 + z1;
		fim =  w2*24*60*60 + x2*60*60 + y2*60 + z2;


		duracao = fim - inicio;
		
		w = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		
		x = resto / (60*60);
		resto = resto % (60*60);
		
		y = resto / 60;
		resto = resto % 60;
		
		z = resto % 60;
					
	  
		System.out.println( (int)w + " dia(s)");//
		System.out.println( (int)x + " hora(s)");
		System.out.println( (int)y + " minuto(s)");
		System.out.println( (int)z + " segundo(s)");

				
		sc.close();
	}
}

