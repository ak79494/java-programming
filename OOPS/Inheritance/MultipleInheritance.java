class Animal {
	int eye;
	public void walks() {
		System.out.println("Animal walks");
	}
}
class Horse extends Animal {
	int legs;
	public void walk() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Chicken extends Horse {
	int leg;
	String eat;
	public void walk1() {
		System.out.println("Chicken walks on 2 walks");
	}
}
class MultipleInheritance {
	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.leg = 2;
		c.eat = "Grass";
		c.eye  = 2;
		c.walks();
		System.out.println("Chicken legs: "+c.leg);
		System.out.println("Chicken eat: "+c.eat);
		System.out.println("Chicken eye: "+c.eye);;
		c.walk1();

		Horse h = new Horse();
		h.eye = 2;
		h.legs = 4;
		System.out.println("Horse eye: "+h.eye);
		System.out.println("Horse legs: "+h.legs);
		h.walk();

	}
}