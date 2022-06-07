package interviewQuestions;

import java.util.Scanner;

public class FourthQ {

	public static void main(String[] args ) {
		
		/*Create four mathematical operations that'd be as a Calculator.
		Ask user to choose one of the operation symbol and calculate the token number according to it*/

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the numbers that'd to be calculated,please");
		
        double num1 = scan.nextInt();

        double num2 = scan.nextInt();
        
        System.out.println("Select what operation 'd to be used : " + " "+ 'x'+" " + '+'+ " " + '-'+ " "+ '/');
		char operator =scan.next().charAt(0);
        
		  calculate(operator,num1, num2);
		
		
		

	}

	private static void calculate(char operator, double num1, double num2) {
		
		  switch (operator) {
		case '+':
			System.out.println(num1 + "+"+ num2 + "="+ (num1+num2 ));
			break;
        case '-':
        	System.out.println(num1 + "-"+ num2 + "="+ (num1-num2 ));
			break;
        case '/':
        	System.out.println(num1 + "/"+ num2 + "="+ (num1/num2 ));
	        break;
        case 'x':
        	System.out.println(num1 + "*"+ num2 + "="+ (num1*num2 ));
	        break;
	   
		}
		
		
		
		
		
	}

}


