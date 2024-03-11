import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
   
	
    public static void main(String[] args) throws NumberFormatException, IOException  {
       
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());  //테스트 케이스 개수
        
        int jum = 2;
        
        for(int i=0; i<N; i++) {
        	
        	jum = (jum-1) + jum; 
        	
        } // for
        
        System.out.println(jum * jum);
        
        
    } // main
    
} // end class