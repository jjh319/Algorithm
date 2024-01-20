

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		N = sc.nextInt();
		
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("");
			int su = sc.nextInt();
			
			nums[i] = su;
		} // for
		
		System.out.print("");
		int v = sc.nextInt();
		
		int count = 0;
		for(int i=0; i<N; i++) {
			
			if(nums[i] == v) {
				count++;
			} // if
			
		} // for
		
		System.out.println(count);
		
	} // main

} // end class
