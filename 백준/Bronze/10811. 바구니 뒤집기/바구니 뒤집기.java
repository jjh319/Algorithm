

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int N; // 가지고 있는 바구니 갯수
		int M; // 역순으로 바꿀 횟수
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("");
		N = sc.nextInt();
		System.out.print("");
		M = sc.nextInt();
		
		int[] nums = new int[N]; // 순서대로 번호를 매길 바구니배열
		
		for(int i=0; i<N; i++) {
			nums[i] = i+1;
		} // for
		
		for(int z=0; z<M; z++) {
			System.out.print("");
			int i = sc.nextInt();
			System.out.print("");
			int j = sc.nextInt();
			
			while(i <= j) {
                int temp = nums[i-1];
                nums[i-1] = nums[j-1];
                nums[j-1] = temp;
                i++;
                j--;
            } // inner while
			
		} // for
		
		for(int i=0; i<N; i++) {
			System.out.print(nums[i] + " ");
		} // for
		
		
	} // main

} // end class
