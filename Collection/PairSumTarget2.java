class PairSumTarget2 {
	public static int findPivot(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < arr[i+1]) {
				return arr[i+1];
			}
		}
		return arr.length;
	}
	public static void findPair(int[] arr,int tar) {
		if(arr.length <= 1) {
			return;
		}
		int pivot = findPivot(arr);
		int high = (pivot-1) % arr.length;
		int low = pivot % arr.length;

		while(low!=high) {
			if(arr[low] + arr[high] == tar) {
				System.out.printf("FoundPivot(%d,%d)",arr[low], arr[high]);
			}
			if(arr[low] + arr[high] < tar) {
				low = (low+1) % arr.length; // low++
			}else{
				high = (arr.length + high-1) % arr.length; /// high--
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int tar = 5;
		findPair(arr,tar);
	}
}