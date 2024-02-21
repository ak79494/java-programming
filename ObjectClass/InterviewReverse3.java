class InterviewReverse3 {
	public static void main(String[] args) {
		String name = "Shruti is a beautiful actress";
		String[] arr = name.split(" ");
		String reversename = " ";
		for(String array : arr) {
			String reversearr = " ";
			for(int i=array.length; i>=0; i--) {
				reversearr = reversearr + array.charAt(i);
			}
			reversename = reversename + reversearr +" ";
		}
		System.out.println(reversename);
	}
}