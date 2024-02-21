class ClassStringSmall {
	public static void main(String[] args) {
		String name = "MY NAME IS ARUN GOSWAMI";
		int n = 22;
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {

			arr[i]+=32;
			System.out.print(arr[i]);
			
		}
	}
}