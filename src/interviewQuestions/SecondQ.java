package interviewQuestions;

import java.util.Scanner;

public class SecondQ {

	public static void main(String[] args) {
		
		//Question even or odd number
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number,please");
        
         double num = scan.nextInt();
      
        
        
        
          System.out.println(num%2!= 0 ? " The given number's even" : " The given number's odd");
       scan.close();
		
	}

}
