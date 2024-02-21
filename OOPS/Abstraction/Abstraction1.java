abstract class Animal {
	abstract void walks();
}
class Horse extends Animal {
	int legs;
	 void walks() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Chicken extends Animal {
	String eat;
	void walks() {
		System.out.println("Chicken walks on 2 legs");
	}
}
class HelperClass {
	static Animal getFeatured(String type) {
		if(type.equals("Horse")) {
			return new Horse();
		}else{
			return new Chicken();
		}
	}
}
class Abstraction1 {
	public static void main(String[] args) {
		Animal ani = HelperClass.getFeatured("Chicken");
		ani.walks();
	}
}