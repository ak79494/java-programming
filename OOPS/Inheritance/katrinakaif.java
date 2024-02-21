class katrinakaif {
	public static void main(String[] args) {
		String name = RashmikaManadanna.whatnewmoviecome();
		System.out.println("new movie name: "+name);
		String heroine = RashmikaManadanna.hotActressPlayRole();
		System.out.println("Beautifil hot actress name: "+heroine);
		String[] names = RashmikaManadanna.allnamesplayRole();
		for(int i=0;i<names.length;i++) {
			System.out.println("All beautiful actress name to play role: "+names[i]);

			Actress0 actress =RashmikaManadanna.getActressdetail();
			System.out.println("Actress name: "+actress.name);
			System.out.println("Actress age: "+actress.age);
			System.out.println("Actress email: "+actress.email);
			System.out.println("Actress sex: "+actress.sex);
		}
	}
}