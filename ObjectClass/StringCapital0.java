class StringCapital0 {
	public static void main(String[] args) {
		String name = "shradha khapra is a best software developer";
		char[] arr = name.toCharArray();
		name = " ";
		for(int i=0; i<arr.length; i++) {
			if(i==0 || arr[i-1]==' '&&arr[i] != ' ') {
				if(arr[i]>=97 && arr[i]<=122)
				arr[i] = (char) (arr[i]-32);
			}else if(arr[i]>=65 && arr[i] <=90)
			arr[i] = (char) (arr[i] +32);
			name = name +arr[i];

		}
		System.out.println(arr);
	}
}