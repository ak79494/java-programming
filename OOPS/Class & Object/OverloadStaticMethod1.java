class OverloadStaticMethod1 {
	static String name = "Shradha";
	static int age = 24;
	public static void display1(){
		System.out.println("display the name");
		System.out.println(name);
	}
	public static void display2() {
		System.out.println("dispaly the shradha age");
		System.out.println(age);
	}
	public static void main(String[] args) {
		OverloadStaticMethod1.display1();
		OverloadStaticMethod1.display2();
	}
}