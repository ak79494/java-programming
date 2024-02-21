class FirstLetterCapital3 {
	public static void main(String[] args) {
		String name="rasa tandan";
		char[] arr = name.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				System.out.print(arr[i]);
			}else {
				arr[i]-=32;
			System.out.print(arr[i]);
			}
			
			
		}
	}
}