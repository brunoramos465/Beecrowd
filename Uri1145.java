package URI;

import java.util.Scanner;

public class Uri1145{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x2 = x;

		for (int i = 1; i <= y; i++) {
		
			if (i < x2) {
				System.out.print(i + " ");	
			} else if (i == x2) {
                System.out.println(i);
			} else if (i > x2) {
				System.out.print(i + " ");
				x2 = x + i - 1; 
			}
		}
		
		sc.close();
	}
}