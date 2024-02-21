class ThrowThrowsRegistration {
	static String name = "Arun";
	static int age = 17;
	static void fillup() {
		System.out.println("Fillup the form");
		System.out.println("Form fillup end");
	}
	static void validation() throws AgeNotValidException3{
		System.out.println("Validation start");
		if(age>=18) {
			System.out.println(name+ " You are allow for driving licence under it Process");
		}else{
			System.out.println(name+ " sorry you can not apply");
			throw new  AgeNotValidException3();
		}
		System.out.println("Validation end");
	}
	static void generate() {
		System.out.println(name+" generate driving licence");
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		fillup();
		validation();
		generate();
		System.out.println("main method end");
	}
}