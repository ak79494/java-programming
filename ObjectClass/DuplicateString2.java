class DuplicateString2 {
	public static void main(String[] args) {
		String name="ellyse Perry";
		int num=0;
		char[] arr = name.toCharArray();
		System.out.println("Duplicate character: ");
		for(int i=0; i<=name.length()-1;i++) {
			for(int j=i+1;j<name.length(); j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]);
					//System.out.println();
					System.out.print(arr[j]);
					num++;
					break;
				}
			}
		}
	}
}