package interviewQuestions;

import java.util.Scanner;

public class FirstQ {

	public static void main(String[] args) {
		
		
		
		
		//Question 1: Print an integer getting input from user
		
    	Scanner scan= new Scanner(System.in);
         System.out.println("Enter a number,please");
         
         
         int num= scan.nextInt();
         System.out.println("The entered number is : " + num);
         
         
        
    	// Ask user to enter a character and print its ASCII value 
    	// EXM -->INPUT :    #      OUTPUT --> Ascii value of the entered character's   =====>>>>  35
         
         
         
         
    	
         System.out.println("Enter a character,please");
         
        char c = '&'; 
        
        int ASCII =c;
         System.out.println("The value of the character's : " + ASCII);
         
         scan.close();
       
	}
	  
	
	

}
