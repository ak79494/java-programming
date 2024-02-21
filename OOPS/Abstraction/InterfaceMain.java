interface Animal4 {
	void walk();
	void eat();
}
class Horse4 implements Animal4 {
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
	public void eat() {
		System.out.println("Horse eats grass");
	}
}
class Chicken4 implements Animal4 {
	public void walk() {
		System.out.println("Chicken walks on 2 legs");
	}
	public void eat() {
		System.out.println("Chicken eats grass");
	}
}
class Helperclass { //factory class, manager class, object creation class= factory design pattern
	static Animal4 getconnect(String type) {
		if(type.equals("Horse")) {
			return new Horse4();
		}else{
			return new Chicken4();
			
		}
	}
}
class InterfaceMain {
	public static void main(String[] args) {

		 Animal4 ani = Helperclass.getconnect("Chicken");
		 ani.walk();
		 ani.eat();
		 
	}
}