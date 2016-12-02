public class sequence {
	/**  
	 * Extract the sub-sequence of maximum length which is in ascending order.
	 * */
	public static void longestSubSequence(int  [] arr){
		int length = 1, max = 1, subIndexStart = 0, subIndexEnd = 0;
		for (int i = 1; i < arr.length; i++) { 																				
		    if (arr[i] > arr[i-1]) {								
		        length++;																			//Count the length of the sequence
		        if (length > max) {																	//Run if a longer ascending sequence exists
		        	subIndexEnd = i+1;																
			        subIndexStart = (i +1)-length;													//Set the index
			        max = length;
			    }
		    } 
		    else {
		    	length = 1;
		    }
		}
		for (int i = subIndexStart; i < subIndexEnd; i++){											//Print the sub-sequence according to index
			if (i == subIndexEnd - 1){
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i] + ", ");													
			}
		}	
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 0, 19, 1, 88, 7, 8, 9, 8, };
	longestSubSequence(a);
	}

}
