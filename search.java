
public class search {
	public static boolean binarySearch(int arr[], int low, int high){
		int first = 0;
		int last = arr.length -1;
		while (last > first){
			int middle = first + (last - first)/2;
			if (arr[middle] >= low && arr[middle] <= high){
				return true;
			}
			else if (arr[middle] < low){
				first = middle + 1;
			}
			else
				last = middle -1;
			}
		return false;
	}

	public static void main(String[] args) {
		int [] shakNum={1,2,4,5,6,7,8,9,13,14,19,21};
		System.out.println(binarySearch(shakNum, 13, 1));
	}

}
