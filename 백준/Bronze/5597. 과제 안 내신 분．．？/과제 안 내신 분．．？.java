

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int n = 28;	
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);	
		
	
		int[] nums = new int[n];
		int[] nums2 = new int[30];
		int[] dab = new int[2];
		
		for(int i = 0; i<n; i++) {
			System.out.print("");
			int s = sc.nextInt();
			
			nums[i] = s;
		} // for
		

		for(int i = 0; i<nums2.length; i++) {
			nums2[i] = i+1;
		} // for
		
		
		for(int i=0; i<n; i++) {
			
			nums2[nums[i]-1] = 0;
			
		} // for
		
		for(int i = 0; i<nums2.length; i++) {
			
			if(nums2[i] != 0) {
				dab[cnt] = nums2[i];
				cnt++;
				
				if(cnt == 2) {
					break;
				} // inner if
				
			} // if
			
			
		} // for
		
		if(dab[0] > dab[1]) {
			System.out.println(dab[1]);
			System.out.println(dab[0]);
		} else {
			System.out.println(dab[0]);
			System.out.println(dab[1]);
		} // if-else
		
		
		
	} // main

} // end class
