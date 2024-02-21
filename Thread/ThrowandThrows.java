class ThrowandThrows {
	static String name = "Aman";
	static int age = 17;
	static void fillup() {
		System.out.println("Fillup the form");
		System.out.println("Fillup end");
	}
	static void validation() throws AgeNotValidException3 {
		System.out.println("Validation start");
		if(age>=19) {
			System.out.println(name+"you are allowing for Driving licence under ");
		}else{
			System.out.println(name+"Sorry you can not apply");
			throw new AgeNotValidException();
		}
		System.out.println("validation end");
	}
	static void generate() {
		System.out.println(name+"genertae driving licence");
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		fillup();
		validation();
		generate();
		System.out.println("main method end");
	}
}