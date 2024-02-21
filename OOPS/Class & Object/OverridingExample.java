class Animal {
	void walk() {
		System.out.println("Animal walks");
	}
}
class Horse extends Animal {
	// override
	void walk() {
		System.out.println("Horse walk on 4 legs");
	}
}
class OverridingExample {
	public static void main(String[] args) {
		Animal ani = new Animal();
		ani.walk();
		Horse horse = new Horse();
		horse.walk();
	}
}