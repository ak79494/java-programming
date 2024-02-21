class RegistrationThrowandThrows1 { 
	static String name = "Shradha";
	static int age = 17;
	static void fillup() {
		System.out.println("fillup the form");
		System.out.println("fillup complete");
	}
	static void validation() throws AgeNotValidException1{
		System.out.println("Validation start");
		if(age>=18) {
			System.out.println(name+ " you van apply for the driving licence under it process");
		}else{
			System.out.println(name+" Sorry you can not apply");
			throw new AgeNotValidException1();
		}
		System.out.println("Validation end");
	}
	static void generated() {
		System.out.println(name+" your driving licence generated");
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		fillup();
		try{
			validation();
		    generated();
		}catch(AgeNotValidException1 e) {
			e.printStackTrace();
		}
		
		System.out.println("main method end");
	}
}