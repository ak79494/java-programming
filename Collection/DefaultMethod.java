interface A {
   default void m1() {
   	System.out.println("default m1() method");
   }
}
class DefaultMethod {
	public static void main(String[] args) {
		A a = new A() {}; // anonymous object
		a.m1();
	}
}