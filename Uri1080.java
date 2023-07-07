package URI;

import java.util.Scanner;

public class Uri1080{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int x = 0;
	    int y = 0;
	    int id = 0;
	    
	    for (int i = 1; i <= 100; i++) {
	    	x = sc.nextInt();
	    	if (x > y) {
	    		y = x;
	    		id = i;  	
	    	}
	    }
	    
	    System.out.println(y);
	    System.out.println(id);
		
		
		sc.close();
	}
}