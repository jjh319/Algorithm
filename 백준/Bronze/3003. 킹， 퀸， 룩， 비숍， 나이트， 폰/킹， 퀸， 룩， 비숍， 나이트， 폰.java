

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int[] black = new int[6]; // 검정색 피스
		int[] white = new int[6]; // 흰색 피스
		
		Scanner sc = new Scanner(System.in);
		
		black[0] = 1;
		black[1] = 1;
		black[2] = 2;
		black[3] = 2;
		black[4] = 2;
		black[5] = 8;
		
		for(int i=0; i<white.length; i++) {
			
			System.out.print("");
			int num = sc.nextInt();
			
			white[i] = black[i] - num;
			
		} // for
		
		for(int i=0; i<white.length; i++) {
			
			System.out.print(white[i] + " ");
			
		} // for
		
		
	} // main

} // end class
