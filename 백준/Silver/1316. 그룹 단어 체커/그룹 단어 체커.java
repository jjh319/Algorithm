import java.util.Scanner;


public class Main {
	
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int cnt = N;

      for(int i=0; i<N; i++) {
    	  String dan = sc.next();
    	  boolean[] check = new boolean[26]; // 알파벳 개수
    	  int prev = 0;
    	  for(int j=0; j<dan.length(); j++) {
    		  int now = dan.charAt(j);

    		  if(j > 0 && prev != now && check[now - 'a'] == true) {
    			  cnt--;
    			  break;
    		  } // if

    		  if(!check[now - 'a']) {
    			  check[now - 'a'] = true;
    		  } // if
    		  
    		  prev = now;
    	  } // for
    	  
      } // for
      
      System.out.println(cnt);
      
   } // main
   
} // end class