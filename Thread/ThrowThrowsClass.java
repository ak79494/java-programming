class ThrowThrowsClass {
	static String name = "Arun";
	static int age = 17;
	public static void fillup() {
		System.out.println("Form fillup start");
		System.out.println("Form fillup end");
	}
	public static void validation() {
		System.out.println("Validation Start");
		if(age>=18) {
			System.out.println(name+" You are allowing for driving licence");
		}else{
			System.out.println(name+ " sorry you can noy apply");
			throw new AgeNotValidException4();

		}
		System.out.println("Validation end");
	}
	public static void generate() {
		System.out.println(name+" your driving licence can be generated");
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		fillup();
		validation();
		generate();
		System.out.println("main method end");
	}
}