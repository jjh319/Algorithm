

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N; 
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("");
		N = sc.nextInt();
		
		String star = "*";
		
		for(int i=0; i<N; i++) {
			System.out.println(star);
			
			star += "*";
		} // for
		
		
	} // main

} // end class
