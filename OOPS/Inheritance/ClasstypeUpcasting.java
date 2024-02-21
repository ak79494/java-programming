class A {
	int i = 22;
	void m() {
		System.out.println("m() method of class A");
	}
}
class B extends A {
	int j = 24;
	void m1() {
		System.out.println("m1() class B");
	}

}
class ClasstypeUpcasting {
	public static void main(String[] args) {
		A a  = new B();
		System.out.println(a.i);
	}
}