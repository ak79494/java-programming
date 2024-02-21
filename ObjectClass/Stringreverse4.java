class Stringreverse4 {  //"Hello" = olleH
	public static void main(String[] args) {
		String name = "Hello";
		char[] arr = name.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
}