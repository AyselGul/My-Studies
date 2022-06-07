package forLoop;

import java.util.Scanner;

public class qst04 {

	public static void main(String[] args) {
		
	
		 //Ask user to enter 5 digits, sum all the given digits except 5-10 and use CONTINUE()
		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		
                  for (int i = 1; i <=10; i++) {
                	  
               System.out.print("Enter " + i + "." + "number");
               
                int num=scan.nextInt();
                
                 sum+=num; 
                 
                 if (num>5 && num<10) {
                	 System.out.println("The number entered cannot be added to sum");
					continue;
				
				}else { System.out.println("You cannot enter more than 5 numbers");
					
				}
                 
	   
	     
	     
}  
       
		}
	      


	}


