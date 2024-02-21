class StaticBlock {
	static int i;
	static{
		System.out.println("first block start");
		i=22;
		System.out.println("i "+i);
	}
	static{
		System.out.println("second block start");
		i=24;
		System.out.println("i "+i);
	}
	public static void main(String[] args) {
		System.out.println("main method executed");
	}
}