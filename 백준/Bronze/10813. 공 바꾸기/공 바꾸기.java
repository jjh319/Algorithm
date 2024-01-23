

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int M,N;
		
		int i,j;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("");
		N = sc.nextInt();
		System.out.print("");
		M = sc.nextInt();
		
		int[] nums = new int[N];
		
		for(int z=0; z<N; z++) {
			nums[z] = z+1;
		} // for
		
		int num;
		for(int z=0; z<M; z++) {
			System.out.print("");
			i =sc.nextInt();
			System.out.print("");
			j =sc.nextInt();
			
			num = nums[i-1];
			nums[i-1] = nums[j-1];
			nums[j-1] = num;
			
		} // for
		
		for(int z=0; z<N; z++) {
			System.out.print(nums[z] + " ");
		} // for
		
		
	} // main

} // end class
