class RecursionSorted {
	public static boolean recSorted(int arr[], int idx) {
		if(idx == arr.length-1 ) {
			return true;
		}
		if(arr[idx] < arr[idx+1]) {
			// sorted array
			return recSorted(arr,idx+1);
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		System.out.println(recSorted(arr, 0));
	}
}