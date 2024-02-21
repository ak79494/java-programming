class ClassStringReverse {
	public static void main(String[] args) {
		String name =  "Danni Wyatt";
		String[] arr = name.spilit(" ");
		for(int i=arr.length; i>=0; i++) {
			System.out.println(arr[i]);
		}
	}
}