abstract class Animal2 {
	abstract void walks();
}
class Horse extends Animal2 {
	void walks() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Chicken extends Animal2 {
	void walks() {
		System.out.println("Chicken walks on 2 legs");
	}
}
class Cow extends Animal2 {
	void walks() {
		System.out.println("Cow walks on 4 legs");
	}
}
class HelperClass {
	static Animal2 getConnection(String type) {
	   if(type.equals("Horse")) {
		   return new Horse();
	   }else if(type.equals("Chicken")) {
		   return new Chicken();
	    }else {
		   return new Cow();
		}
	}   
}
class AbstractclassAnimal {
	public static void main(String[] args) {
		Animal2 ani = HelperClass.getConnection("Cow");
		ani.walks();
	}
}