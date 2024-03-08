import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
   
	
    public static void main(String[] args) throws NumberFormatException, IOException  {
       
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());  //테스트 케이스 개수
        int quarter = 25;  // 쿼터 0.25$
        int dime = 10;  // 다임 0.10$
        int nickel = 5;  // 니켈 0.05$
        int penny = 1;  // 페니 0.01$
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            
            sb.append(c / quarter + " ");
            c %= quarter;
            
            sb.append(c / dime + " ");
            c %= dime;
            
            sb.append(c / nickel + " ");
            c %= nickel;
            
            sb.append(c / penny + "\n");
        } // for
        
        System.out.print(sb);
        	
    } // main
    
} // end class