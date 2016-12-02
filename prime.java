public class prime {
	/**  
	 * Check if a number is prime
	 * */
	public static Boolean isPrimeRecursion(int number, int divisor ){			//Check whether n is divisible by any number below n)		 
	    if (divisor == 1){														//Base case, if number is prime
	    	System.out.println("It is a prime number");
	    	return true;
	    }
	    else{
	        if (number % divisor ==0){											//Check if a remainder exists
	        	System.out.println("It is a not prime number");
	        	return false;
	        }
	    }
	    return isPrimeRecursion(number, divisor - 1);							//Divisor is decreasing each call
	}
	    
	public static Boolean isPrime(int num){
	    if (num <= 1){
	        System.out.println("It is not a prime number");
	        return false;
	    }
	  
	    return isPrimeRecursion(num, num - 1);									//It starts with a number below n
	}

	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}
}
