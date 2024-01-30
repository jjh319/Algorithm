

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String S;
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("");
		S = sc.next();
		
		int[] al = new int[26];  // 비교 배열
		
		
		for(int i=0; i<al.length; i++) {
			al[i] =  -1;
		} // inner for
		
		for(int i=0; i<S.length(); i++) {
			
			char c = S.charAt(i);
			
			if(al[c - 'a'] == -1) {
				al[c - 'a'] = i;
			} // if
			
		} // for
		
		for(int num : al) {
			System.out.print(num + " ");
		} // enhanced for
		
	} // main

} // end class
