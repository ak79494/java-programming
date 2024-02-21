class Reference{
	static int i; // static variable/ data member
	static void m(int i){
		System.out.println("m()executed");
		System.out.println(i);
		System.out.println(Reference.i);
	}
}
class TestReference{
	public static void main(String[] args) {
		Reference.m(24);
	}
}