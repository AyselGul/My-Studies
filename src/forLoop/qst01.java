package forLoop;

public class qst01 {

	public static void main(String[] args) {
	       /* Write sum of the numbers that could be divided into 13  from 100 - 0 */
	        
		int sum=0;
		
      for (int i = 100; i > 0; i--) {
    	   if (i%13==0) {
    		   System.out.print(i + " ");
			sum+=i;
		}
    	  
		
	}
      System.out.println();
      
      System.out.println("The total sum is : " + sum);
	}

}
