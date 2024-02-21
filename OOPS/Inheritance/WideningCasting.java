class WideningCasting {
	public static void main(String[] args) {
		int x = 10;
		// automatically convert long type
		long y = x;
		 //automatically convert float
		float z = y;

		System.out.println("Before conservation int value: "+x);
		System.out.println("After conservation long value: "+y);
		System.out.println("After conservation float value: "+z);
	}
}