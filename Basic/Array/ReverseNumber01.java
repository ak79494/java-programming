class ReverseNumber01 {
	public static void main(String[] args) {
		int[] arr = 
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Reverse Array: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" "); 
		}
	}
}