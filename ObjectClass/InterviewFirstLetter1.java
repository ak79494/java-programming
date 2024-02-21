class InterviewFirstLetter1 {
	public static void main(String[] args) {
		String name = "Palak Tiwari Is The Daughter Of Shweta Tiwari";
		char[] arr = name.toCharArray();

		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=65 && arr[i]<=90) {
				arr[i] = (char) (arr[i]+32);
				System.out.println(arr);
			

		}
		
	}
}