class ArraySmallLargest {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		int largest = arr[0];
		int smallest = arr[0];
		for(int number : arr ) {
			if(number>largest) {
				largest = number;
			}
			else if(smallest>number){
				smallest = number;
			}
		}
		System.out.println("largest : Smallest "+largest+" : "+smallest);

	}
}