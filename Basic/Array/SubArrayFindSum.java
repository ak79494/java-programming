class SubArrayFindSum {
	public static int findPivot(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < arr[i+1]) {
				return arr[i+1];
			}
		}
		return arr.length;
	}
	public static void findPair(int[] arr, int sum) {
		if(arr.length <= 1) {
			return;
		}
		int pivot = findPivot(arr);
		int high = (pivot-1) % arr.length;
		int low = pivot % arr.length;

	    while(low != high) {
		    if(arr[low] + arr[high] == sum) {
			    System.out.printf("pair found (%d,%d)",arr[low], arr[high]);
			    return;
		    }
		    if(arr[low] + arr[high] < sum) {
			    low = (low+1) % arr.length;
		    }else{
			    high = (arr.length+high-1) % arr.length;
			}    
		}
		System.out.println("sum not foun");
	}
	public static void main(String[] args) {
		int arr[] = {1, 4, 20, 3, 10, 5};
		int sum =23;
		findPair(arr,sum);
	}
}