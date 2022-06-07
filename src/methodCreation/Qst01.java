package methodCreation;

import java.util.Scanner;

public class Qst01 {

	public static void main(String[] args) {
		/*
     Ask user to enter a number and find out if the number's perfect number*/
       
    	 Scanner scan= new Scanner(System.in);

		   System.out.println("Enter a number,please");
	         
	         int num= scan.nextInt();
	        
      
         perfectNum(num);
         scan.close();
         
	}

	private static void perfectNum(int num) {
		
		 int value=0;
		 
		for (int i = 1; i <num; i++) {
			
			if (num%i==0) {
			value+=i;
			}
		}
		
		if (value==num) {
			System.out.println("It's a perfect number");
		} else {
			System.out.println("It's not a perfect number");
		}
	}

	{
}
}