class ConvertStringToCharArray {
	public static void main(String[] args) {
		String name = "Samachar";
		char[] arr = name.toCharArray();
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
