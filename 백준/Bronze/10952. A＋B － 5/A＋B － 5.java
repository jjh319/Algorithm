

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
			System.out.print("");
			int A = sc.nextInt();
			
			System.out.print("");
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			} // if
			
			System.out.println(A+B);
			
		} // while
		
		
		
		
		
	} // main

} // end class
