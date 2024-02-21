class FindlargestSmallest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int largest = arr[0];
		int smallest = arr[0];
		for(int number : arr) {
			if(number>largest) {
				largest = number;
			}else if(smallest > number) {
				smallest = number;
			}
		}
		System.out.println("largest: "+largest);
		System.out.println("Smallest: "+smallest);
	}
}