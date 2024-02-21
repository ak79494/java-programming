class ReverseNumber1 {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,0};
		System.out.print("Original arrays is: ");
		for(int i=0; i<arr.length; i ++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("New arrays is: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}