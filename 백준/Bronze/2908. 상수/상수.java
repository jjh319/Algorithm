import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		A = sc.nextInt();
		
		System.out.print("");
		B = sc.nextInt();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		if(A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		} // if-else
		
	} // main

} // end class
