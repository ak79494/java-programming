class DuplicateString {
	public static void main(String[] args) {
		String[] arr = {"Arun","Mukesh","Arun","Shekhar"};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])&&i!=j) {
					System.out.println("Duplicates: "+arr[i]);
				}
			}
		}
	}
}