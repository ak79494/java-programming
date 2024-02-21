class Fruit {
	public void test() {
		System.out.println("There are different types of fruit");
	}
}
class Apple extends Fruit {
	public void eat() {
		super.test();
		System.out.println("Appes is a types of fruit");
	}
}
class Override01 {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.test();
		a.eat();
	}
}