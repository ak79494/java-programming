class InterviewReverse1 {
	public static void main(String[] args) {
		String name = "jacqueline farnendez";
		String[] arr = name.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}