package URI;

import java.util.Scanner;

public class Uri1072{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		int out = 0, in = 0;
		
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else if (x <= 0){
				
			} else {
				out = out +1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");

		
		sc.close();
	}
}