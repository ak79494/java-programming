class Parent {
	String name;
	void display() {
		System.out.println("Display the parent name");
	}
}
class Child extends Parent {
	String name;
	void display() {
		System.out.println("Display the child name");
	}
}
class OverRidingMethod {
	public static void main(String[] args) {
		Parent parent = new  Parent();
		parent.display();
		parent.name = "Shradha";
		System.out.println("Parent name: "+parent.name);
		
		Parent parent2 = new Child();
		parent2.display();
		parent2.name = "Aman";
		System.out.println("Child name: "+parent2.name);
		
	}
}