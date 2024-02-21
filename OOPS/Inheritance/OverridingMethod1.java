class Animal {
	public void walks() {
		System.out.println("Animal walks");
	}	
}
class Horse extends Animal {
	int legs;
	String color;
	public void eat() {
		super.walks();
		System.out.println("Animal eat grass");
	}
}
class OverridingMethod1 {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.legs = 2;
		h.color = "Brown" ;
		System.out.println("Horse Legs: "+h.legs);
		System.out.println("Horse color: "+h.color);
		h.walks();
		h.eat();
	}
}