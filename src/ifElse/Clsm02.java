package ifElse;

import java.util.Scanner;

public class Clsm02 {

	public static void main(String[] args) {
		
		/* Ask user to enter a character and check if it's letter or not*/

		
		 Scanner scan = new Scanner(System.in);
			
	      System.out.println("Enter a character ,please"); 
	      
	    char c = scan.next().charAt(0);
	    		
	     
	    if (c >'A' && c <'Z' || c >'a' && c <'z') {
			System.out.println("It's a letter");
		} else {
			System.out.println("It's not a letter");
	}
	    
	    
	    
	scan.close();    

}
	
	

	
}