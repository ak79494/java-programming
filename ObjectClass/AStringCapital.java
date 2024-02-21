class AStringCapital {
	public static void main(String[] args) {
		String name = "ellyse alexandra perry is an australian sportswoman";
		char[] arr = name.toCharArray();

		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>=97 && arr[i]<=122) {
				arr[i] = (char) (arr[i]-32);
			}
			System.out.print(arr[i]);
		}
	}
}