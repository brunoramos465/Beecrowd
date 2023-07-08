package URI;

import java.util.Scanner;

public class Uri1142{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x1 = 1,x2 = 2,x3 = 3;
		
		System.out.println(x1 + " " + x2 + " " + x3 + " PUM");

		for (int i = 1; i < n; i++) {	
			x1 = x1 + 4;
			x2 = x2 + 4;
			x3 = x3 + 4;
			System.out.println(x1 + " " + x2 + " " + x3 + " PUM");
		}
		
		sc.close();
	}
}