

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int M,N;
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("");
		N = sc.nextInt();
		System.out.print("");
		M = sc.nextInt();
		
		int[] nums = new int[N];
		
		for(int z=0; z<M; z++) {
			System.out.print("");
			i = sc.nextInt();
			System.out.print("");
			j = sc.nextInt();
			System.out.print("");
			k = sc.nextInt();
			
			for(; i<=j; i++) {
				nums[i-1] = k;
			} // for
			
		} // for
		
		for(int z=0; z<N; z++) {
			System.out.print(nums[z] + " ");
		} // for
		
		
	} // main

} // end class
