

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	
    	int[][] arr = new int[N][M];
    	
    	for(int k=0; k<2; k++) {
    		
    		for(int i=0; i<N; i++) {
    			
    			for(int j=0; j<M; j++) {
    				
    				arr[i][j] += sc.nextInt();
    				
    			} // for
    			
    		} // for
    		
    	} // for
    	
    	
    	for(int i=0; i<N; i++) {
    		
    		for(int j=0; j<M; j++) {
    			
    			System.out.print(arr[i][j] + " ");
    			
    		} // for
    		System.out.println();
    		
    	} // for
    	
        
    } // main
    
} // end class
