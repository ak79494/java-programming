class OverloadMainMethod {
	public static void main(int args1) {
		System.out.println("main() overload"+ "method1 executed");
	}
	public static void main(char args1) {
		System.out.println("main() overload"+ "method2 executed");
	}
	public static void main(String[] args) {
		System.out.println("original main()" + "ececuting");
	}
}