class StaticBlock1 {
	static String name;
	static{ // block 1
		System.out.println("Executed first block");
		name = "Shradha";
		System.out.println("Name: "+name);

	}
	static{ // 2nd block
		System.out.println("Executed 2nd block");
		name = "Aman";
		System.out.println("Name: "+name);

	}
	public static void main(String[] args) {
		System.out.println("Executed original main method");
	}
}