

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N; 
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("");
		N = sc.nextInt();
		
		String end = "";
		
		
		for(int i=0; N/4>i; i++) {
			end += "long ";
		} // for
		
		System.out.println(end + "int");
		
		
	} // main

} // end class
