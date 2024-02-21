class ClassStringSplit {
	public static void main(String[] args) {
		String name = "Ellyse  beautiful Perry"; // Perry Ellyse
		String[] arr = name.split(" ");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}