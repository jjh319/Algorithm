

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int n = 10;	 // 입력 횟수
		int cnt = 0;  // 카운트
		
		Scanner sc = new Scanner(System.in);	
		
		int[] nums = new int[n]; // 입력한 값을 넣을 배열
		int[] namuji = new int[n];  // 나머지 값을 넣을 배열
		
		for(int i=0; i<n; i++) {
			System.out.print("");
			int su = sc.nextInt();
			
			nums[i] = su; 
		} // for
		
		for(int i=0; i<n; i++) {
			namuji[i] = nums[i] % 42;
		} // for
		
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				if(namuji[i] == namuji[j]) {
					cnt++;
					break; 
				} // if
				
			} // inner for
				
		} // for
		
		System.out.println(n-cnt);
		
		
	} // main

} // end class
