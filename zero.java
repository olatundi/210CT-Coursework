import java.util.Scanner; 

public class zero {
	private static Scanner scan;
	/**  
	 * Count the number of trailing 0s in a factorial number
	 * */
	public static int trailing(){                     									    
	    try{
	    	scan = new Scanner(System.in);													//Uses the Scanner class to get user input
	    	System.out.println("Enter a factorial number:");							
	    	int num = scan.nextInt();														//Variable to store user input
	    	
	    	if(num <0){
	    		System.out.println("Theres is no factoial number less than 0");
	    	}
	    	
	    	int numZeros=0;                     										    //Variable used to count the trailing zero
	        while (num>0){                     											 
	            num=(int) Math.floor(num/5);                      							//Rounds down the value of the division	to a whole number																
	        	numZeros+=num ;                											    //count the 5s in prime factors of n or the occurrence of the floor division
	        }
	        return numZeros;    
	    }
	    catch(Exception e){
	    	System.out.println("An exception caught");
	    	System.out.println("The input must be incorrect");
	    	System.out.println("The input must be a positive integer");
	    }
		return 0;
	}

	public static void main(String[] args) {
	    System.out.println(trailing());
	}
}
