class WidenningRevision {
	public static void main(String[] args) {
		byte x =  10;
		int y = x;
		float z = y;

		System.out.println("Before conservation byte value "+x);
		System.out.println("After conservation int value "+y);
		System.out.println("After conservation Float value "+z);
	}
}