class FirstLetterCapital1 {
	public static void main(String[] args) {
		String name = "arun kumar goswami";
		char[] arr = name.toCharArray();

		boolean foundSpace = true;
		for(int i=0; i<arr.length; i++) {

			if(Character.isLetter(arr[i])) {
				if(foundSpace) {
					arr[i] = Character.toUpperCase(arr[i]);
					foundSpace = false;
				}
			}else{
				foundSpace = true;
			}
			
		}
		name = new String(arr);
			System.out.println(name);

	}
}