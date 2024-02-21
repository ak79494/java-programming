class Animal0 {
	int eye;
	void walk() {
		System.out.println("Animal walks on road");
	}
}
class Horse extends Animal0 {
	int legs;
    void walk() {
    	super.walk();
    	System.out.println("Horse walk on 4 legs");
    }
}
class OVERriding1 {
	public static void main(String[] args) {
		Horse horse  = new Horse();
		horse.eye = 2;
		horse.legs = 4;
		System.out.println("Horse eye: "+horse.eye);
		System.out.println("Horse legs: "+horse.legs);
		horse.walk();
	}
}
