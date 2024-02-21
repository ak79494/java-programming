interface Animal2 {
	int i = 10;
	void walk();
}
class Horse2 implements Animal2 {
	public void walk() {
		System.out.println("Store in MySQL Database server: horse walks on 4 legs");
	}
}
class Chicken2 implements Animal2 {
	public void walk() {
		System.out.println("Store in Oracle Database server: Chicken walks on 2 legs");
	}
}
class Helperclass {
	static Animal2 getconnection(String type) {
		if(type.equals("MySQL")) {
			return new Horse2();
		}else{
			return new Chicken2();
		}
	}
}
class Interface1 {
	public static void main(String[] args) {
		Animal2 ani =  Helperclass.getconnection("Oracle");
		System.out.println(Animal2.i);
		ani.walk();
	}
}