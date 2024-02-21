class Azamsr{
	int age;
	String address;

	Azamsr(){
		age = 27;
		address = "banglore";
	}
	public void printInfo(){
		System.out.println(this.age);
		System.out.println(this.address);
	}
	class Student00{
		static int age = 24;
    static String name = "Arun";
  
    // This is Static method
    static void display()
    {
        System.out.println("static age is " + age);
        System.out.println("static string is " + name);
    }

	}
	public static void main(String[] args) {
		Azamsr obj = new Azamsr();
		obj.printInfo();
		display();
		
	}
}