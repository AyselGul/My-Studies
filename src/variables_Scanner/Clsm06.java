package variables_Scanner;

public class Clsm06 {

	public static void main(String[] args) {
		
		
		// SWAPPING NUMBERS and STRINGS
		
		//     ************* WITH NUMBERS*****************
		
		// 1. way --->  assigning  the values 
		// 2. way --->  useing a temp to change the place of the values
		 
		int num1=20;
		int num2=35;
		
		
		System.out.println("Number 1 before swapping :" + num1 + "\n" + "Number 2 before swapping :" + num2);
		
		
		int temp = num2;
		num2=num1;
		num1=temp;
		 

		System.out.println("Number 1 after swapping :" + num1 + "\n" + "Number 2 after swapping :" + num2);
	
		
		//************* WITH STRINGS***************
		
		
		String st = "Java";
		String st1 = "Enjoyable";
		
		System.out.println("String before swapping :" + st +" " + st1 );
		
		
		
		String empty = st1;
		empty=st1;
		
		
		System.out.println("String after swapping :" + empty +" "+ st);
		
		
	
		
		 

	}

}
