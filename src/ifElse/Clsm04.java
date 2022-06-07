package ifElse;

import java.util.Scanner;

public class Clsm04 {

	public static void main(String[] args) {
		

                  /* Ask user to enter two numbers
                   * If both numbers are positive sum them,
                   * If both numbers are negative multiple them,
                   * If both numbers have different signs, write" you cannot operate with different mathematical signs"
                   * If one of the number's is equal to 0 write " 0 is absorbed element under multiplication"  */
		
		 Scanner scan = new Scanner(System.in);
			
	      System.out.println("Enter two numbers ,please"); 
	      
	      double num1 = scan.nextDouble();
	      double num2 = scan.nextDouble();
	     
	     
	      if (num1>0 && num2 >0) {
			System.out.println("The result's : " + (num1+num2));
		} else if (num1<0 && num2<0) {
			System.out.println("The result's : " + (num1-num2));
		} else if (num1<0 || num2>0 && num2<0 || num1>0) {
			System.out.println("you cannot operate with different mathematical signs");
		} else if(num1==0 || num2==0){
			System.out.println("0 is absorbed element under multiplication");
		}{
		
		
                                                                                                           
		}
}
}