package variables_Scanner;

import java.util.Scanner;

public class Clsm05 {

	public static void main(String[] args) {
		
            
    	// Ask user to enter radius of the circle and calculate the diameter
		
		
		  Scanner scan = new Scanner(System.in);
		
	      System.out.println("Enter the radius of the circle ,please"); 
	      
	      double num1 = scan.nextDouble();
	     
		System.out.println("Diameter : " + num1*num1);
		
		
		
		
		System.out.println();
		
		
		// Ask user to enter the lenght of the square for calculating its area and perimeter
		
		 System.out.println("Enter the lenght of the square for calculating its area and perimeter,please"); 
	      
	      double num2 = scan.nextDouble();
	     
		System.out.println(" Area of the square : " +  num2*num2 + "\n"+ "Perimeter of the square : " + (num2*4));
		
		
	}

}
