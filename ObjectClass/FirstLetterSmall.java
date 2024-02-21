class FirstLetterSmall {
	public static void main(String[] args) {
		String name = "Rasa Is a Beautiful Bollywood Actress";
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] >= 65 && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);
			}/*else if(arr[i] >= 97 && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			}*/

		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}