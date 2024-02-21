class User1 {
	static String appName;
	String name;
	long phone;

	//function
	void transaction() {
		System.out.println("welcome to "+appName);
		System.out.println(name+"the transaction whose phone number "+phone);
	}
}

class UserTest1 {
	public static void main(String[] args) {
		User1.appName = "PhonePay";

		User1 u = new User1();
		u.name = "shradha";
		u.phone = 7903508584L;
		u.transaction();
	}
}