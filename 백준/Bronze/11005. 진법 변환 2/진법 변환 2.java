import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
   
	
    public static void main(String[] args) throws NumberFormatException, IOException  {
       
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dan = Integer.parseInt(st.nextToken()); // 10진법 수 입력
        int n = Integer.parseInt(st.nextToken()); // 변환할 진법 입력
        
        StringBuilder sb = new StringBuilder();
        
        while (dan > 0) {
            int remainder = dan % n; // n진법으로 변환 시 나머지 = 해당 자리의 값
            
            if (remainder < 10) {
            	
                sb.append((char)('0' + remainder)); // 숫자를 문자로 변환하여 추가
                
            } else {
            	
                sb.append((char)('A' + (remainder - 10))); // 10 이상의 값은 알파벳으로 표시
                
            } // if-else
            
            dan /= n; // 다음 자리수를 계산하기 위해 나눗셈 실행
        } // while

        System.out.println(sb.reverse().toString()); // 거꾸로 된 순서를 바로잡기 위해 StringBuilder를 뒤집음
        br.close();
        	
    } // main
    
} // end class