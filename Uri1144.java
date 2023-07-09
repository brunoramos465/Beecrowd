package URI;

import java.util.Scanner;

public class Uri1144{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n2 = 1;
		
		for(int i = 1; i <= n; i++) {
			n2 = i * i;
			int n3 = n2 * i; 
			
			System.out.println(i + " " + n2 + " " + n3);
			System.out.println(i + " " + (n2 + 1) + " " + (n3 + 1));
			
		}
		
		
		sc.close();
	}
}