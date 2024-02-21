class ReverseArray2 {
	public static void main(String[] args) {
		int[] arr = {0,2,1,4,3,6};
		System.out.println("Oriinal list: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Reverse List: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}