
import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) {
      
      String dan;
      int cnt = 0; // 카운트
      
      Scanner sc = new Scanner(System.in);
      System.out.print("");
      dan = sc.next();
      
      for(int i=0; i<dan.length(); i++) {
    	  
    	  if(dan.charAt(i) == 'c') {
    		  
    		  if(i < dan.length()-1) {
    		  
	    		  if(dan.charAt(i+1) == '=') {
	    			  
	    			  i++;
	    			  
	    		  } else if(dan.charAt(i+1) == '-') {
	    			  
	    			  i++;
	    			  
	    		  }  // if
    		  
    		  } // if
    		  
    	  } // if
    	  
    	  if(dan.charAt(i) == 'd') {
    		  
    		  if(i < dan.length()-2) {
    		  
	    		  if(dan.charAt(i+1) == 'z') {
	    			  
	    			  if(dan.charAt(i+2) == '=') {
	    				  
	    				  i += 2;
	    				  
	    			  } //if
	    			  
	    		  } // if
	    		  
    		  } // if
	    		 
    		  if(i < dan.length()-1) {
    		  
    		  	  if(dan.charAt(i+1) == '-') {
	    			  
	    			  i++;
	    			  
	    		  } // if
    		  
    		  } // if
    		  
    	  } // if
    	  
    	  if(dan.charAt(i) == 'l') {
    		  
    		  if(i < dan.length()-1) {
    		  
	    		  if(dan.charAt(i+1) == 'j') {
	    			  
	    			  i++;
	    			  
	    		  }  // if
    		  
    		  } // if
    		  
    	  } // if
    	  
    	  if(dan.charAt(i) == 'n') {
    		  
    		  if(i < dan.length()-1) {
    		  
	    		  if(dan.charAt(i+1) == 'j') {
	    			  
	    			  i++;
	    			  
	    		  } // if
    		  
    		  } // if
    		  
    	  } // if
    	  
    	  if(dan.charAt(i) == 's') {
    		  
    		  if(i < dan.length()-1) {
    		  
	    		  if(dan.charAt(i+1) == '=') {
	    			  
	    			  i++;
	    			  
	    		  } // if
    		  
    		  } // if
    		  
    	  } // if
    	  
    	  if(dan.charAt(i) == 'z') {
    		  
    		  if(i < dan.length()-1) {
    		  
	    		  if(dan.charAt(i+1) == '=') {
	    			  
	    			  i++;
	    			  
	    		  }  // if
    		  
    		  } // if
    		  
    	  } // if
    	  
    	 cnt++;
    	  
      } // for
      
      System.out.println(cnt);
      
      
   } // main

} // end class