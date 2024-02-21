class ReverseArray {
	public static void main(String[] args) {
		int[] num = {0,4,2,8,6};
		System.out.print("Before Reverse: ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.print("After reverse: ");
		for(int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+" ");
		}
	}
}