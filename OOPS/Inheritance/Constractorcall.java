class Whatsapp {
	String name;
	long phone;
	Whatsapp(String name, long phone){
		System.out.println("registered by:"+name+" with phone number: "+phone);
	this.name = name;
	this.phone = phone;
	}
}
class Whatsapp2 extends Whatsapp {
	Whatsapp2(String name, long phone){
		super(name,phone);
	}
}
class Constractorcall {
	public static void main(String[] args) {
		Whatsapp2 wat = new Whatsapp2("Shradha", 1234567890L);
		System.out.println(wat.name);
		System.out.println(wat.phone);

	}
}