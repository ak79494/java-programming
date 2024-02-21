class Base1{
	String name;
	Base1(){
		System.out.println("initialised non parameterised");
		name = "shradha";
		System.out.println(name);
	}
		}
		class Derived1 extends Base1 {
		Derived1(){
			super();
			System.out.println("derived class executed: "+name);
	}
}
class Cchanning {
	public static void main(String[] args) {
		Derived1 derived = new Derived1();
	}
}