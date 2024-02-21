class OverloadStaticMethod {
	public static void walk() {
		System.out.println("Dispaly the walks result");
	}
	public static void walk(int legs) {
		System.out.println("Display the result walks on 4 legs");
	}
	public static void main(String[] args) {
		OverloadStaticMethod.walk();
		OverloadStaticMethod.walk(4);
	}
}