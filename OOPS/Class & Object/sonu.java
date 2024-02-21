class Girl{
	String name;
	String address;
	int age;
	long phone;
}
class Sonu{
	static void tellmeGirlName(){
		System.out.println("The girl name is Shradha");
	}
	static long getGirlNumber(){
		System.out.println("Sonu Sharing girl number");
		return 1234567890L;
	}
	static long[] getGirlsNumber(){
		System.out.println("Sonu sharing girls number");
		long[] phones = {2345678901L,3456789012L,4567890123L};
		return phones;
	}
	static Girl getGirlAjddress(){
		System.out.println("Sonu will collect all the information of girl and share the monu");
		Girl g = new Girl();
		g.name = "Shradha khapra";
		g.address = "Delhi";
		g.age = 24;
		g.phone = 5678901234L;
		return g;


	}
}
