class InterviewFirstLetterSmall {
	public static void main(String[] args) {
		String name = "Arun Goswami Is a Software Developer";
		char[] arr =name.toCharArray();

		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] >= 65 && arr[i] <= 90) {
				arr[i] = (char) (arr[i]+32);
			}
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}