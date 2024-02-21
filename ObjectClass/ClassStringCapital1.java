class ClassStringCapital1 {
	public static void main(String[] args) {
		String name = "ellyse perry"; // Ellyse perry
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				arr[i]-=32;
				System.out.print(arr[i]);

			}else{
				System.out.print(arr[i]);
			}
		}
	}
}