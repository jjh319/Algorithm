import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
   
	
    public static void main(String[] args) throws NumberFormatException, IOException  {
       
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String dan = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        br.close();

        int tmp = 1; // 초기 가중치
        int sum = 0; // 변환된 10진수 값을 저장

        for(int i = dan.length()-1 ; i >= 0; i--){ 
        	
            char C = dan.charAt(i);
            
            if ('A' <= C && C<= 'Z') {
                sum += (C - 'A' + 10) * tmp; // 알파벳을 10진수로 변환
            } else {
                sum += (C - '0') * tmp; // 숫자를 10진수로 변환
            } // if-else
            
            tmp *= n;
        } // for

        System.out.println(sum);
        	
        	
    } // main
    
} // end class