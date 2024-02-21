class ClassReverseString {
	public static void main(String[] args) {
		String name = "Ellyse Perry";
		char[] arr = name.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}