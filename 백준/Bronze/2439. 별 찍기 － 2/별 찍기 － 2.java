

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N; 
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("");
		N = sc.nextInt();
		
		String star = "*";
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<N-1-i; j++) {
				System.out.print(" ");
			} // inner for
			
			System.out.print(star);
			
			star += "*";
			System.out.println();
			
		} // for
		
		
	} // main

} // end class
