class Actress0 {
	String name;
	int age;
	String email;
	String sex;
}
class RashmikaManadanna {
	static String whatnewmoviecome() {
		System.out.println("Rashmika mandanna can share the new move name");
		return "the kashmir files";
	}
	static String hotActressPlayRole() {
		System.out.println("Rashmika mandanna can also share the hot actress name");
		return "Shradha khapra";
	}
	static String[] allnamesplayRole() {
		System.out.println("Rashmika mandanna can also share all details of the movie");
		String[] names = {"Nora, Shradha, jacquiline"};
		return names;
	}
	 static  Actress0 getActressdetail() {
	 	System.out.println("Rashmika mandanna will collect all the imformation of the hot acress");
	 	Actress0 actress = new Actress0();
	 	actress.name = "Shradha khapra";
	 	actress.age = 24;
	 	actress.email ="shradha00@100";
	 	actress.sex = "female";
	 	return actress;
	 }
}