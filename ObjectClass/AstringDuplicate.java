class AstringDuplicate {
	public static void main(String[] args) {
		String name = "ellyse alexandra perry";
		int num=0;
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]);
					num++;
					break;
				}
			}
		}
	}
}