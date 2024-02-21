class Student {
	int eye;
	public void walks() {
		System.out.println("Students are walking");
	}
}
class Shradha extends Student {
	int age;
	int legs;
	public void walk() {
		super.walks();
		System.out.println("Shradha walks on 2 legs");
	}
}
class Override {
	public static void main(String[] args) {
		Shradha shradha = new Shradha();
		shradha.walks();
		shradha.eye = 2;
		shradha.age = 24;
		shradha.legs = 2;
		System.out.println("Shradha eye: "+shradha.eye);
		System.out.println("Shradha age: "+shradha.age);
		System.out.println("Shradha legs: "+shradha.legs);

		shradha.walk();
	}
}
