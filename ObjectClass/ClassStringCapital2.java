class ClassStringCapital2 {
	public static void main(String[] args) {
		String name = "my name is arun goswami";
		char[] arr = name.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(i==0 || i==3 || i==8 || i==11 || i==16) {
				arr[i]-=32;
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]);
			}
		}
	}
}