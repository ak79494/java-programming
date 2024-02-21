class AstringReverse1 {
	public static void main(String[] args) {
		String name = "ellyse alexandra perry";
		char[] arr = name.toCharArray();

		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}