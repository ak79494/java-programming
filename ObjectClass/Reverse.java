class Reverse {
	public static void main(String[] args) {
		String input = "Azam";
		char[] arr = input.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}