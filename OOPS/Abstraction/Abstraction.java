abstract class Animal1 {
	abstract void walk1();
}
class Horse1 extends Animal1 {
	void walk1() {
		System.out.println("Store in MySQL Database server: Horse walks on 4 legs ");
	}
}
class Chicken1 extends Animal1 {
	void walk1() {
		System.out.println("Store in ORACLE Database server: Chicken walks on 2 legs ");
	}
}
class Dog1 extends Animal1 {
	void walk1() {
		System.out.println("Store in Mongo Database server: Dog walks on 4 legs ");
	}
}
class Helperclass {
	static Animal1 getconnection(String type) {
		if(type.equals("MySQL")) {
			return new Horse1();
		}else if(type.equals("ORACLE")) {
			return new Chicken1();
		}
		else{
			return new Dog1();
		}
	}
}

class Abstraction {
	public static void main(String[] args) {
		Animal1 ani =  Helperclass.getconnection("Mongo");
		ani.walk1();
	}
}