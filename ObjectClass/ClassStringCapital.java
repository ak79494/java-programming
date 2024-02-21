class ClassStringCapital {
	public static void main(String[] args) {
		String name = "ellyse perry";
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {
			arr[i]-=32;
			System.out.print(arr[i]);
		}
	}
}