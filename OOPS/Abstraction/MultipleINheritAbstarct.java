interface Animal3 {
	void walk();
}
interface Herbivore {
	void walk();
}
class Horse3 implements Animal3,Herbivore {
	public void walk() {
		System.out.println("walks on 4 legs");
	}
	
}
class MultipleINheritAbstarct {
	public static void main(String[] args) {
		Horse3 horse = new Horse3();
		horse.walk();
	}
}