class ClassDuplicateElement1 {
	public static void main(String[] args) {
		String name = "ellysePerry";
		char[] arr = name.toCharArray();
		System.out.println("Duplicate String-->");
		int num = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; i++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]);
					num++;
					break;
				}
			}
			System.out.println();
		}
	}
}