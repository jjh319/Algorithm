import java.util.Scanner;

public class Main {

   
   public static void main(String[] args) {
      
      String dan; // 입력
      String re = ""; // 비교
      
      Scanner sc = new Scanner(System.in);
      System.out.print("");
      dan = sc.next();
      
      for(int i=dan.length()-1; i>=0; i--) {
    	  re = re + dan.charAt(i); 
      } // for
      
      
      if(dan.equals(re)) {
    	  System.out.println("1");
      } else {
    	  System.out.println("0");
      }
      
      
   } // main

} // end class