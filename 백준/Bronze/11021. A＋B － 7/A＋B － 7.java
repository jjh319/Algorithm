

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int T; 
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("");
		T = sc.nextInt();
		
		int[] num1 = new int[T];
		int[] num2 = new int[T];
		int[] dab = new int[T];
		
		for(int i=0; i<T; i++) {
			System.out.print("");
			int A = sc.nextInt();
			
			System.out.print("");
			int B = sc.nextInt();
			
			num1[i] = A;
			num2[i] = B;
			
			dab[i] = A+B;
			
		} // for
		
		for(int i=0; i<T; i++) {
			System.out.println("Case #"+ (i+1) + ": " + dab[i]);
		} // for
		
	} // main

} // end class
