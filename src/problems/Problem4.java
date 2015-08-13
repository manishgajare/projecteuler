/**
 * 
 */
package problems;

/**
 * @author manishgajare
 *
 */
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0;
		int reverse=0;;
		int temp;
		int palindrome=0;
		
		for (int i = 999; i > 100; i--) {
	        for (int j = i; j > 100; j--) {
	        	number = i*j;
	        	temp = number;
	    		reverse = 0;
	    			
	    			while( temp != 0 )
	    		      {
	    		          reverse = reverse * 10;
	    		          reverse = reverse + temp%10;
	    		          temp = temp/10;
	    		      }
	    		
	    		if(reverse==number){
	    			if(number>palindrome)
	    			palindrome = number;
	    		}
	        	
	        } 
	        
	        
		}
		
		
	System.out.println("Largest Palindrome: "+palindrome);
		
		
	}

}
