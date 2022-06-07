package interviewQuestions;

import java.util.Scanner;

public class ThirdQ {

	public static void main(String[] args) {
		// Ask user to enter a number that is under 100 
		// start from 1 to entered value;
		// if the number is multiple of 3 write " Java"
		// if the number is multiple of 5 write "enjoyable"
		// if the number is multiple of 3 and 5 write " Java is enjoyable"
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number,please");
        
         int num = scan.nextInt();
      
		for (int i = 1; i<= num ; i++) {
			if (i%3==0 && i%5==0 ) {
				System.out.println("Java");
			} else if(i%5==0){
				System.out.println("enjoyable");
			}else if(i%3==0) {
				System.out.println("Java is enjoyable");
			}else {
				System.out.println(i);
			}
		}
		
		
		
		
scan.close();
	}

}
