public class perfect {
	/**  
	 * Highest perfect square which is less 
	 * or equal to its parameter
	 * */	
	public static int maxPerfect(int n){   
		if (n == 0){													//Checking if the user inputs a positive integer 
			System.out.println("Please enter a positive integer");
			return 0;
		}
		else if( n < 0){
			System.out.println("Please enter a positive integer");
		}
		int perfect = 1;
		for (int i = 1; (i*i)<=n; ++i){									//The loop increases the value of i before it checks the condition
			perfect = i*i;												//Variable to store the perfect square number
		}    
		return perfect;
		}
	
	public static void main(String[] args) {
		System.out.println(maxPerfect(16));
	}
}
