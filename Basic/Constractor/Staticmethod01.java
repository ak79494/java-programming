class Staticmethod01{
	static String subject = "Java";
	static String topic = "OOPs";

	static void display(){
		System.out.println("Subject: "+subject);
		System.out.println("topic: "+topic);
	}
	void nonstatic(){
		display();
	}
	public static void main(String[] args) {
		Staticmethod01 obj = new Staticmethod01();
		obj.nonstatic();
		display();
	}
}