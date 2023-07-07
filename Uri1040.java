package URI;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4,n5, media,mediaExame;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4)/10;
		
		if(media >= 7.0) {
			System.out.printf("Media: %.1f%n", media );
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.printf("Media: %.1f%n",media );
			System.out.println("Aluno reprovado.");
		} else if (media > 5.0 || media < 6.9 ) {
			n5 = sc.nextFloat();
			mediaExame = (n5 + media)/2;
			if(mediaExame > 5.0) {
				System.out.printf("Media: %.1f%n",media );
				System.out.println("Aluno em exame.");
				System.out.printf("Nota do exame: %.1f%n",n5);
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n",mediaExame);
			} else if (mediaExame < 4.9){
				System.out.printf("Media: %.1f%n",media );
				System.out.println("Aluno em exame.");
				System.out.printf("Nota do exame: %.1f%n",n5);
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n",mediaExame);
			}
				
		} 
		
		sc.close();
		
	}
}