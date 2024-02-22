import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) {
      
      String dan;
      int[] al = new int[26]; // 알파벳 배열
      
      Scanner sc = new Scanner(System.in);
      System.out.print("");
      dan = sc.next();
      
      for(int i=0; i<dan.length(); i++) {
    	  
    	  if(dan.charAt(i) >= 'a' && dan.charAt(i) <= 'z') {
    		  al[dan.charAt(i) - 97]++;
    	  } else {
    		  al[dan.charAt(i) - 65]++;
    	  } // if-else
    	  
      } // for
      
      int max = 0;
      char ch = 'a';
      
      for(int i=0; i<al.length; i++) {
    	  
    	  if(al[i] > max) {
    		  max = al[i];
    		  ch = (char) (i + 65);
    	  } else if(al[i] == max){
    		  ch = '?';
    	  } // if-else if
    	  
      } // for
      
      System.out.println(ch);	
      
   } // main

} // end class