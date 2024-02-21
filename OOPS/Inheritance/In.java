class Animal{
	int eye;
	public void eat(){
		System.out.println("animal eat");
	}
}
class Horse extends Animal {
	public void walk() {
		System.out.println("walks on 4 legs");

	}
}
class Chicken extends Animal {
	public void walk() {
		System.out.println("walks on 2 legs");
	}
}
class In {
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		horse.eat();
		Chicken chicken = new Chicken();
		chicken.eye = 2;
		System.out.println(chicken.eye);
	}
}