package variables_Scanner;

import java.util.Scanner;

public class Clsm03 {

	public static void main(String[] args) {
		
		
            // Ask user his/her name, surname, age, height, weight
		
		
		Scanner scan = new Scanner(System.in);
		
      System.out.println("Enter your name,please");
      String name=scan.next();
      
      System.out.println("Enter your surname,please");
      String surname=scan.next();
      
      
      
      System.out.println("Enter your age,please");
      int age=scan.nextInt();
      
      
      
      System.out.println("Enter your height,please");
      int height=scan.nextInt();

      
      
      
      
      System.out.println("Enter your weight,please");
      int weight=scan.nextInt();
      
      System.out.println("My name's : "+ name+ "\n" + "My surname's : " +surname+ "\n"  + "Age : "+age+
    		                       "\n"+"Height : " +height +"cm"+ "\n"+"Weight : " + weight+ "kg");
      
      scan.close();
	}

}
