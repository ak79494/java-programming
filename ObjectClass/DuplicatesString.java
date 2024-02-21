class DuplicatesString {
	public static void main(String[] args) {
		String[] arr = {"java", "python",  "c++","python"};
		for(int i=0;i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])&&i!=0) {
					System.out.println("duplicate: "+arr[i]);
				}
			}
		}
	}
}