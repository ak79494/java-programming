class WideningtypeCasting {
	public static void main(String[] args) {
		byte age = 10;

		int i = age;
		System.out.println("byte age: "+age);
		System.out.println("int i: "+i);

		i*=23;
		System.out.println(i);

		age*=23;
		System.out.println(age);
	}
}