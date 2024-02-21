class SelectionSort {
	public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {8, 6, 4, 0, 2, 1};
		for(int i=0; i<arr.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					smallest = j;
					//swap
					int temp = arr[j];
					arr[smallest] = arr[i];
					arr[i] = temp;
				}
			}
		} 
		printArray(arr);
	}
}