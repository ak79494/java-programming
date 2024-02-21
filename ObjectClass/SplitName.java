class SplitName {
	public static void main(String[] args) {
		String name = "Shradha khapra";
		String[] arr = name.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}