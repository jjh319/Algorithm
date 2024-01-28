

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int T;   // 입력 수
		String text; // 문자열 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			System.out.print("");
			text = sc.next();
			
			System.out.print(text.charAt(0));
			System.out.println(text.charAt(text.length()-1));
		} // for
		
		
	} // main

} // end class
