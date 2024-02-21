class Parent {
	String name;
	Parent(String name) {
		this.name =  name;
	}
}
class Child extends Parent {
	int age;
	long phone;
	Child(int age, long phone) {
		super("Shradha");
		this.age =  age;
		this.phone = phone;
		System.out.println("display the Shradha biography");
	}
}
class ChainningcConstractor {
	public static void main(String[] args) {
		Child child = new Child(24,9876543210L);
		System.out.println( "name: "+child.name);
		System.out.println("age: "+child.age);
		System.out.println ("Phone number: "+child.phone);
	}
}