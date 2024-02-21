abstract class Animal {
	abstract void walk();
}
class Horse extends Animal {
	public void walk() {
		System.out.println("horse walk on 4 legs");
	}
}
class chicken extends Animal {
	public void walk() {
		System.out.println("chicken walk on 2 legs");
	}
}
class AbstractionOOPS {
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();

		
	}
}
