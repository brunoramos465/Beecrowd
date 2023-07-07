package URI;

import java.util.Scanner;

public class Uri1074{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
		
		for (int i = 0; i < n; i++) {
			 x = sc.nextInt();

			 if (x % 2 == 0) {
					if (x > 0) {
						System.out.println("EVEN POSITIVE");
					} else if (x < 0) {
						System.out.println("EVEN NEGATIVE");
					} else if (x == 0) {
						System.out.println("NULL");
					}
			} else if (x % 2 == 1 || x % 2 == -1 ){
				if (x > 0) {
					System.out.println("ODD POSITIVE");
				} else if (x < 0) {
					System.out.println("ODD NEGATIVE");
				}
			}
			 
				 
		
		}
		
		sc.close();
	}
}