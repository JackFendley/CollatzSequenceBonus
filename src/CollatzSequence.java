import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class CollatzSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
	double userNum = 0;
	double userEven = 2;
	
	System.out.print("Please enter a number: ");
	userNum = userInput.nextDouble();
	
	while(userNum != 1){

		System.out.println(userNum);
		
		if(userNum%userEven==0){
			userNum = userNum / 2;
		} else {
			
			userNum = userNum * 3 + 1;
		}
	        	         	  
	}
	
	userInput.close();
		
		
	}

}
