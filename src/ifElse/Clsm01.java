package ifElse;

import java.util.Scanner;

public class Clsm01 {

	public static void main(String[] args) {
		
               // Ask user to enter two numbers and make him/his to prefer what four math operation to use
		
		 Scanner scan = new Scanner(System.in);
			
	      System.out.println("Enter two numbers ,please"); 
	      
	      double num1 = scan.nextDouble();
	      double num2 = scan.nextDouble();
	     
	      
	      System.out.println("Select the operations\n "+"1)-> Sum\n " + "2)-> Subtract\n "+"3)-> Multiply\n "+ "4)-> Divide");
	      
	      int slct=scan.nextInt();
	   {
			
		}
	      if (slct==1) {
			System.out.println(num1+num2);
		} else if(slct==2){
			System.out.println(num1-num2);
		}else if(slct==3){
			System.out.println(num1*num2);
		}else if (slct==4) {
			System.out.println(num1/num2);
		} else {
			System.out.println("Pick only one of the provided number,please");
		}{
			
		}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	 scan.close() ;    
	      
	      
	}

}
