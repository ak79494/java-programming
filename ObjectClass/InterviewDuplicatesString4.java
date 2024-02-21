class InterviewDuplicatesString4 {
	public static void main(String[] args) {
		String name = "shradha khapra";
		char[] arr = name.toCharArray();
		int num = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]);
					num++;
					break;
				}
			}
		}
	}
}