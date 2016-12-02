class Binary {
	/**  
	 * Outputs whether a value within a specific interval was found
	 * */	
	public static Boolean binarySearcher(int[] arr, int low, int high) {				//Find if a value exist between LOW and HIGH
		int firstPos = 0;																
		int lastPos = arr.length - 1;
		while(lastPos > firstPos) {
			int midPos = firstPos + (lastPos - firstPos) / 2;							
			if (arr[midPos] >= low && arr[midPos] <= high) {
				return true;
			}	
			else if(arr[midPos] < low) {												//If the value exists in the upper half
				firstPos = midPos + 1;
			}	
			else {																		//If the value exists in the lower half
				lastPos = midPos - 1;
			return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int [] someArray = {2, 4, 5, 6, 7, 8, 9, 10, 20};
		System.out.println(binarySearcher(someArray, 9, 19));
	}

}
