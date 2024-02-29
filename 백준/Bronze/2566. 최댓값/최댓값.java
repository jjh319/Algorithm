

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[][] arr = new int[9][9];
    	int max = -1; // 최대값
    	
    	int x = 0; // 행
    	int y = 0; // 열
    	
    	for(int i=0; i<9; i++) {
    		
    		for(int j=0; j<9; j++) {
    			arr[i][j] = sc.nextInt();
    		} // for
    		
    	} // for
    	
    	for(int i=0; i<9; i++) {
    		
    		for(int j=0; j<9; j++) {
    			
    			if(arr[i][j] > max) {
    				max = arr[i][j];
    				x = i + 1;
    				y = j + 1;
    			} // if
    			
    		} // for
    
    		
    	} // for
    	
    	System.out.println(max);
    	System.out.println(x + " " + y);
    	
        
    } // main
    
} // end class
