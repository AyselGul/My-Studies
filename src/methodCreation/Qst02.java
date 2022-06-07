package methodCreation;

import java.util.Scanner;

public class Qst02 {

	public static void main(String[] args) {
		
		// Ask user to enter a String and create a method that reverse the the given String
	 
		  Scanner scan = new Scanner(System.in);
			
	      System.out.println("Enter a String ,please"); 
	      String str=scan.nextLine();
	      
	     

	}

	  public static String reverseStr(String str) {
		  String reverseStr="";
		
		for (int i = str.length()-1 ; i >= 0; i--) {
			reverseStr+=str.substring(i, i+1);
			   
			
			
		}
		return reverseStr;
		
		
	}

}
