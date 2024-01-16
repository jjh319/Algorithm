
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int T;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		T = sc.nextInt();
		
		int[] num = new int[T];
		for(int i=0; i<T; i++) {
			System.out.print("");
			int A = sc.nextInt();

			System.out.print("");
			int B = sc.nextInt();
			
			num[i] = A+B;
		} // for
		
		for(int i=0; i<T; i++) {
			System.out.println(num[i]);
		} // for
		
		
	} // main

} // end class
