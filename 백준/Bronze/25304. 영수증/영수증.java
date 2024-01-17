

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int X; // 총액
		int N; // 구매한 물건의 종류 수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		X = sc.nextInt();
		
		System.out.print("");
		N = sc.nextInt();
		
		int[] money = new int[N];
		int[] num = new int[N];
		
		for(int i=0; i<N; i++) {
			System.out.print("");
			int coin = sc.nextInt();
			
			System.out.print("");
			int su = sc.nextInt();
			
			money[i] = coin;
			num[i] = su;
		} // for
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum = sum + (money[i] * num[i]);
		} // for
		
		if(X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		} // if-else
		
	} // main

} // end class
