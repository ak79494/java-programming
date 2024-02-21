interface Animal {
	int eye = 2;
	void walks();
}
class Horse implements Animal {
	int legs;
	public void walks() {
		System.out.println("Horse walks on 4 legs");
	}
}
class Chicken implements Animal{
	String color;
	public void walks() {
		System.out.println("Chicken walks on 2 legs");
	}
}
class HelperClass {
	static Animal getFeatureds(String type) {
		if(type.equals("Horse")) {
			return new Horse();
		}else{
			return new Chicken();
		}
	}
}
class Interface2 {
	public static void main(String[] args) {
		Animal ani = HelperClass.getFeatureds("Chicken");
		System.out.println("Chicken eye: "+ani.eye);
		ani.walks();
	}
}