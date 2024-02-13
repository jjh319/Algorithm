import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		String letter;
		int cnt = 0; // 단어 갯수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		letter = sc.nextLine().trim();
		
		if (letter.isEmpty()) { // 입력된 문자열이 없는 경우
            System.out.println(0);
            return;
        } // if
		
		for(int i=0; i<letter.length(); i++) {
			
			if(letter.isEmpty()) {
				break;
			} // if
			
			if(letter.charAt(i) == ' ' ) {
				cnt++;
			} // if
			
		} // for
		
		
		System.out.println(cnt+1);
		
		

	} // main

} // end class
