class Member {
	String name;
	long phone;
	void chat() {
		System.out.println(name+"can be read or text message");
		System.out.println("phone+can make graop call");

	}
}
class Admin extends Member {
	void addRemove() {
		System.out.println(name+" also can add or remove");
	}
}
class Groupchat {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.name = "Shradha";
		mem.phone = 123456789L;
		mem.chat();
		System.out.println("===========");
		Admin ad = (Admin)mem;
		ad.chat();
		ad.addRemove();
	}
}