

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i<N; i++ ) {
			
			int num = sc.nextInt();
			
			boolean bl = true; // 소수면 true or false
			
			if(num == 1) {
				continue;
			} // if
			
			for(int j = 2; j<num; j++) {
				
				if(num % j == 0) {
					bl = false;
					break;
				} // if
				
			} // for
			
			if(bl) {
				cnt++;
			} // if
			
		} // for
		
		System.out.println(cnt);
        
    } // main
    
} // end class
