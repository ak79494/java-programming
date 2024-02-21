class Animal {
	int eye = 2;
	public void eat(){
		System.out.println("Animal eating");
	}
}
class Lion extends Animal {
	int legs;
	public void walk(){
		System.out.println("Lion walks on 4 leg");
	}
}
class Tiger extends Lion {
	String color;
	public void printcolor(){
		System.out.println("color of tger is red");
	}
}

class MultipleIn{
	public static void main(String[] args) {
		Lion l1 = new Lion();
		System.out.println("eye of lion: "+l1.eye);
		l1.eat();
		l1.legs =4;
		System.out.println("lion walks on: "+l1.legs);
		l1.walk();

		Tiger t1 = new Tiger();
		t1.color = "red";
		System.out.println("color of tiger: "+t1.color);
		t1.legs = 4;
		System.out.println("tiger walls on legs: "+t1.legs);
		t1.printcolor();

	}
}