class StringLettr3Reverse {
	public static void main(String[] args) {
		String name = "Arun Goswami"; .. nurA imawsoG
		String[] arr = name.split(" ");

		String reverseString = " ";
		for(String array : arr) {
			String reversearr = " ";
			for(int i=array.length()-1; i>=0; i--) {
				reversearr = reversearr + array.charAt(i);
			}
			reverseString = reverseString + reversearr + "";
		}
		System.out.println(reverseString);
	}
}