package ifElse;

import java.util.Scanner;

public class Clsm03 {

	public static void main(String[] args) {
		
		/* Ask user to enter his/her marks over 100. Convert the entered number into letter
		  -  if is less than 50’ it's--> “D”, 
		  -  if it's between 50-60 it's --> “C”,
		  -  if it's between 60-80 it's -->“B”, 
		  -  if it's more than 80 it's -- > “A” */
		
		 Scanner scan = new Scanner(System.in);
			
	      System.out.println("Enter your mark ,please"); 
	      
	      double mark = scan.nextDouble();
	      if (mark<50) {
			System.out.println("Your mark's : " + "D");
		} else if (mark>50 && mark<60) {
			System.out.println("Your mark's : " + "C");
		} else if (mark<60 && mark<80) {
			System.out.println("Your mark's : " + "B");
		} else {
			System.out.println("Your mark's : " + "A");
		}{

		}{

		}
	     
		

	}

}
