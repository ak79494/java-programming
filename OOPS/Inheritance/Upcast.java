class Animal1 {
	int eye;
	String eat;
	void display() {
		System.out.println("Display the animal feature");
	}
}
class Horse1 extends Animal1 {
	String color;
	int leg;
	void display2() {
		System.out.println("horse walks on leg");
	}
}
class UPcast {
	public static void main(String[] args) {
		// upcasting
		Animal1 ani = new Horse1();
		ani.eye = 2;
		ani.eat = "grass";
		System.out.println("Animal eye: "+ani.eye);
		System.out.println("Animal eat: "+ani.eat);
		ani.display();
       // downcasting
		Horse1 h = (Horse1)ani;
		h.color = "white";
		h.leg = 4;
		System.out.println("horse color: "+h.color);
		System.out.println("horse leg: "+h.leg);
		h.display2();

	}
}