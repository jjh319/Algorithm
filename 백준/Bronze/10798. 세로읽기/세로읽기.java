

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
		char[][] arr = new char[5][15];

		String input = "";
		
		for (int i = 0; i < arr.length; i++) {
			input = sc.next();
			
			for (int j = 0; j < input.length(); j++) {
				arr[i][j] = input.charAt(j);
				
			} // for
			
		} // for

		
		for (int i = 0; i < 15; i++) { 
			
			for (int j = 0; j < 5; j++) { 
				
				if (arr[j][i] == '\0') {
					continue;
				} // if
				
				System.out.print(arr[j][i]);

			} // for
			
		} // for
        
    } // main
    
} // end class
