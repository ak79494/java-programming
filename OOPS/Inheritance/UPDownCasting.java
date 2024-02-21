class Animal{  //// up casting and downcasting
	void walks() {
		System.out.println("Animal walk");
	}
}
class Horse extends Animal {
	void walk() {
		System.out.println("horse walk on 4 legs");
	}
}
class Dog extends Animal {
	void makeNoise() {
		System.out.println("Dog make noide bho bho");
	}
}
class UPDownCasting{
	public static void main(String[] args) { // up casting and downcasting
		Animal ani = new Horse();
		ani.walks();

		Horse h = (Horse)ani;
		h.walk();

		Animal ani2 = new Dog();
		ani2.walks();
		Dog d = (Dog)ani2;
		d.makeNoise();
	}
}