class PairSumTarget1 {
	public static int findPivot(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < arr[i+1]) {
				return arr[i+1];
			}
		}
		return arr.length;
	}
	public static void findPair(int[] arr, int tar) {
		if(arr.length<=1) {
			return;

		}
		int pivot = findPivot(arr);
		int high = (pivot-1) % arr.length;
		int low = pivot % arr.length;

		while(low != high) {
			if(arr[low] + arr[high] == tar) {
				System.out.printf("foundPivot(%d,%d)",arr[low], arr[high]);

			}
			if(arr[low] + arr[high]  < tar) {
				low = (low+1) % arr.length; // low++
			}else{
				
			}

		}
		
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		int tar = 14;
		findPair(arr,tar);
	}
}