class NarrowingTypeCasting {
	public static void main(String[] args) {
		int age = 10;
		byte i = (byte)age;
		System.out.println("int age: "+age);
		System.out.println("byte i: "+i);

		i+=2;
		System.out.print("int i: "+i);

		age+=2;
		System.out.println("byte age: "+age);
	}
}