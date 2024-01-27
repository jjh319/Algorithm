

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int N;  // 과목 수
		double avg;   // 최종 평균값
		double M;  // 가장 큰 점수
		double sum = 0;  // 바꾼 점수들의 총합
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		N = sc.nextInt();
		
		double[] nums = new double[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("");
			int su = sc.nextInt();
			
			nums[i] = su;
		} // for
		
		M = nums[0] ; // 비교하기 위해 첫번째 값을 넣어줌
		
		for(int i=0; i<N; i++) {
			
			for(int j=i+1; j<N; j++) {
				
				if(nums[i] < nums[j]) {
					
					if(M < nums[j]) {
						M = nums[j];
					} // inner if
					
				} // if
				
			} // inner for
			
		} // for
		
		for(int i=0; i<N; i++) {
				
			nums[i] = ( nums[i] / M * 100 );
		
			sum += nums[i];
		} // for
			
		avg = (double) sum / N;
		
		System.out.println(avg);
		
	} // main

} // end class
