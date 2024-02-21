class StringLetter2 {
	public static void main(String[] args) {
		String name = "Arun";
		System.out.println("input: "+name);
		System.out.print("output: ");
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {
                if(i==0) {
                	arr[i]+=32;
                	System.out.print(arr[i]);
                }else{
                    arr[i]-=32;
                    System.out.print(arr[i]);
          
			}
			
		}
	}
}