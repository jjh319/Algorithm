

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int N;  // 숫자의 개수
		int sum = 0; // 전부 더한 값
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("");
		N = sc.nextInt();
		
		System.out.print("");
		String su = sc.next();
			
		for(int i=0; i<N; i++) {
			sum += su.charAt(i)-'0';
		} // for
		
		System.out.println(sum);
		
	} // main

} // end class
