class Narrowcast {
	public static void main(String[] args) {
		double age = 22;
		int num = (int)age;
		byte code = (byte)num;
		System.out.println("before conservation double value: "+age);
		System.out.println("After conservation int value: "+num);
		System.out.println("After conservation byte value: "+code);
	}
}