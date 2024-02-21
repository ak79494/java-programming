class InterviewReverse2 {
	public static void main(String[] args) {
		String name = "jacqueline farnendez beautiful actress";
		String[] arr = name.split(" ");
		String reversename = " ";
		for(String array : arr) {
			String reversearr = " ";
			for(int i=array.length()-1; i>=0; i--) {
				reversearr = reversearr + array.charAt(i);
			}
			reversename = reversename + reversearr+" ";
		}
		System.out.println(reversename);
	}
}