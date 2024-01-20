

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N;
		int X;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		N = sc.nextInt();
		
		System.out.print("");
		X = sc.nextInt();
		
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("");
			int su = sc.nextInt();
			
			nums[i] = su;
		} // for
		
		for(int i=0; i<N; i++) {
			
			if(nums[i] < X) {
				System.out.print(nums[i] + " ");
			} // if
			
		} // for
		
	} // main

} // end class
