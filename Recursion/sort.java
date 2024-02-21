class sort { //2 4 6 8 10
	public static boolean recSort(int arr[], int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		if(arr[idx] < arr[idx+1]){
			return recSort(arr,idx+1);
		}else{
			return false;
		}	
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		System.out.println(recSort(arr, 0));
	}
}