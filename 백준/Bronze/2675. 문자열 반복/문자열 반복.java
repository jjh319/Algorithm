

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int T; // 입력 수
		int R; // 반복 횟수
		String S;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			
			while(true) {
				
				System.out.print("");
				R = sc.nextInt();
				
				System.out.print("");
				S = sc.next();
				
				for(int j=0; j<S.length(); j++) {
					
					for(int z=0; z<R; z++) {
						System.out.print(S.charAt(j));
					} // inner for
					
				} // for
				System.out.println();
				break;
				
			} // while
			
		} // for
		
		
	} // main

} // end class
