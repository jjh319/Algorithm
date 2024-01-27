

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		String S; // 문자열 입력
		int i;   // i번째
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		S = sc.next();
		System.out.print("");
		i = sc.nextInt();
		
		System.out.println(S.charAt(i-1));
		
		
		
	} // main

} // end class
