

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		n = sc.nextInt();
		
		int num = 0;
		
		for(int i=1; i<=n; i++) {
			num = num+i; 
		} // for
		
		System.out.println(num);
		
		
	} // main

} // end class
