import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		String dan;
		
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		dan = sc.next();
		
		for(int i=0; i<dan.length(); i++) {
			
			
			if(dan.charAt(i) == 'A' || dan.charAt(i) == 'B' || dan.charAt(i) == 'C' ) {
				cnt += 3;
			} else if(dan.charAt(i) == 'D' || dan.charAt(i) == 'E' || dan.charAt(i) == 'F') {
				cnt += 4;
			} else if(dan.charAt(i) == 'G' || dan.charAt(i) == 'H' || dan.charAt(i) == 'I') {
				cnt += 5;
			} else if(dan.charAt(i) == 'J' || dan.charAt(i) == 'K' || dan.charAt(i) == 'L') {
				cnt += 6;
			} else if(dan.charAt(i) == 'M' || dan.charAt(i) == 'N' || dan.charAt(i) == 'O') {
				cnt += 7;
			} else if(dan.charAt(i) == 'P' || dan.charAt(i) == 'Q' || dan.charAt(i) == 'R' || dan.charAt(i) == 'S') {
				cnt += 8;
			} else if(dan.charAt(i) == 'T' || dan.charAt(i) == 'U' || dan.charAt(i) == 'V') {
				cnt += 9;
			} else if(dan.charAt(i) == 'W' || dan.charAt(i) == 'X' || dan.charAt(i) == 'Y' || dan.charAt(i) == 'Z') {
				cnt += 10;
			} // if-else if
				
				
		} // for
		
		System.out.println(cnt);
		
		
	} // main

} // end class
