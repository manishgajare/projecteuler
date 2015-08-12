/**
 * 
 */
package problems;

/**
 * @author manishgajare
 *
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 2;
		int total = 0;
		int temp = 0;
		do{
			if(j%2==0){
				total = total + j;
			}
			temp = i + j;
			i = j;
			j = temp;
			
		}while(j<4000000);
		
		System.out.print("Total is: "+total);
		
		
	}

}
