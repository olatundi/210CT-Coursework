import java.util.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class shuffling{
	/**  
	 * Randomly shuffles an array of integers
	 * */																			
	public static void arrayShuffler(int[] arr){  							//The function will implement Fisher-Yates shuffle algorithm
		Random rand = ThreadLocalRandom.current(); 							//This generates random number
		for (int index = arr.length - 1; index > 0; index--){
			int randomPos = rand.nextInt(index + 1);   						/*This generates the next random number within the range 
		   																	of the bound number, exclusively*/
			int temp = arr[randomPos];										//This stores the value in the random position to be shuffled
			arr[randomPos] = arr[index];									//The value in random position and current index in the loop are swapped
			arr[index] = temp;	
		}
		int[] shuffledArray =  arr; 										/* Since arr contains the reference, the return value
		 																	must store in same type variable	*/
		System.out.println(Arrays.toString(shuffledArray)); 				
		}
	
	public static void main(String args[]){ 
		int[] someArray = { 1, 2, 4, 5, 6, 9, 11, 13, 15, 16 }; 
	    arrayShuffler(someArray);
	}
}
	
