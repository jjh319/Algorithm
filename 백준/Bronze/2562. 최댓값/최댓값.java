

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N = 9;
		int max = 0;
		int cnt = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("");
			int A = sc.nextInt();
			
			nums[i] = A;
		} // for
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<N; j++) {
				
				if(nums[i] > nums[j]) {
					
					if(nums[i] > max) {
						max = nums[i];
					}
					
				}
				
			} // inner for
			
		} // for
		
		for(int i=0; i<N; i++) {
			
			if(nums[i] == max) {
				break;
			} // if
			
			cnt++;
			
		} // for
		
		System.out.println(max);
		System.out.println(cnt);
		
	} // main

} // end class
