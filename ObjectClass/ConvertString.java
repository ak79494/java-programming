class ConvertString {
	public static void main(String[] args) {
		String str = "Azam Amir Reza"; // output "mazA rimA azeR"
		String[] arr = str.split(" ");

		String reverseString = "";
		for(String array : arr) {
			String reversearr = "";
			// reverse loop
			for(int i=array.length()-1; i>=0; i--) {
				reversearr = reversearr+ array.charAt(i);	
			}
			reverseString = reverseString + reversearr + " ";
		}
		System.out.println(reverseString);
	}
}