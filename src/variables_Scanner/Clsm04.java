package variables_Scanner;

import java.util.Scanner;

public class Clsm04 {

	public static void main(String[] args) {

             // ASk user to enter integer number for Math Operations
		
		Scanner scan = new Scanner(System.in);
		
	      System.out.println("Enter two different numbers,please");
	      int num1 = scan.nextInt();
	      int num2 = scan.nextInt();
	      
	      System.out.println("Sum of numbers : " + (num1+num2));
	      System.out.println("Subtraction of numbers : " + (num1-num2));
	      System.out.println("Division of numbers : " + (num1/num2));
	      System.out.println("Multiplication of numbers : " + (num1*num2));
	}

}
