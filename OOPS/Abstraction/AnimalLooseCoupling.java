interface Animal {
	void walk();
	void eat();
}
class Horse implements Animal {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
	public void eat() {
		System.out.println("horze eat grass");
	}
}
class Chicken implements Animal {
	public void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
	public void eat() {
		System.out.println("Chicken eat grass");
	}
}
class HelperClass {
	static Animal getConnect(String type) {
		if(type.equals("Horse")) {
			return new Horse();
		}else{
			return new Chicken();
		}
	}
}
class  AnimalLooseCoupling {
	public static void main(String[] args) {
		Animal ani = HelperClass.getConnect("Chicken");
		ani.walk();
		ani.eat();
	}
}