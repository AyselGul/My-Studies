package variables_Scanner;

import java.util.Scanner;

public class Clsm01 {

	public static void main(String[] args) {
		
		
		// 12345 sort the given number up to down
		
		
		int num=12345;
		
		int ones= num%10;                       //ilk rakami almak icin modules daha sonrada sayinin 10'a bolunmesi islemi yapilir 
		int tens= (num/10)%10;
		int hundreds= (num/100)%10;
		int thousands= (num/1000)%10;
		int tenthousands=(num/10000);
		
		System.out.println( tenthousands +"\n" + thousands + "\n" +hundreds +"\n"+ tens+"\n"+ones);
 
  
		 
	}

	
}
