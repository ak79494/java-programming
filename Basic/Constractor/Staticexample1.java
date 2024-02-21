class Staticexample1{
	static int num = 40;
	static String name = "Arun";
	static void display(){
		// this is static method
		System.out.println("number: "+num);
		System.out.println("name: "+name);
	}
	void nonstatic(){
// static method can be accesed in non static method
	}
	public static void main(String[] args) {
		Staticexample1 obj = new Staticexample1();
		obj.display();

		//call main method
		display();
	}
}