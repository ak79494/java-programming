class ArraySecondHighest {  
	public static void main(String[] args) {
		int arr[] = {10, 20, 25, 63, 96, 57};
		int size = arr.length;
		for(int i=0; i<size; i++) {
			for(int j = i+1; j<size; j++) {
				if(arr[i] > arr[j]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("The second highest number "+arr[size-2]);
	}
}