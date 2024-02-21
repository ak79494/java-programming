class ClassDuplicateElement {
	public static void main(String[] args) {
		String name = "EllysePerry";
		char[] arr = name.toCharArray();

		int n = arr.length;
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
                    count++;

                    int k = j;
                    while(k < n-1) {
                        arr[k] = arr[k+1];
					    k++;
                    }
                    j--;
				    n--;
				}

			}
			System.out.println(arr[i] + "-->"+ count);
		}		
		
	}
}