package forLoop;

import java.util.Scanner;

public class qst02 {

	public static void main(String[] args) {

		// Ask user to enter a String and write its reverse
		  
		 Scanner scan = new Scanner(System.in);
			
	      System.out.println("Enter a String ,please"); 
	      
	     String str = scan.nextLine().toLowerCase();
	      
	     String newStr = " ";

	     
	      for (int i =str.length()-1; i>= 0; i--) {
	    	   newStr+=str.substring(i, i+1);
			
		}
	  System.out.println("New String's : " + newStr);
	  scan.close();
	}

}
