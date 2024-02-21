class StringCapitalSmall {
	public static void main(String[] args) {
		String name = "AZAM";
		System.out.println("Name : "+name);
		System.out.print("Output: ");
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {
			arr[i] += 32;
			System.out.print(arr[i])
		}
	}
}