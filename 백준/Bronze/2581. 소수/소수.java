

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;  // 소수들의 합
		int min = N; // 최소값을 넣을 변수
		
		for(int i = M; i<=N; i++) {
			
			boolean bl = true;
			
			if(i == 1) bl = false;
			
			for(int j = 2; j<i; j++) {
				
				
				if(i % j == 0) {
					bl = false;
					break;
				} // if
				
			} // for
			
			
			if(bl) {
				
				if(min > i) {
					min = i;
				} // if
				
				sum += i;
				
			} // if
			
			
		} // for
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		} // if-else
		
		

	} // main

} // end class
