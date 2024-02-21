class NarrowingCasting {
	public static void main(String[] args) {
		double x = 10.0;
		int y =(int) x;
		byte z = (byte)y;

		System.out.println("Before conservation double value: "+x);
		System.out.println("After conservation int value: "+y);
		System.out.println("After conservation byte value: "+z);

	}
}