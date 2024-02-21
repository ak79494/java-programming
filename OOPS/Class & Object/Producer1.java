class Producer1{
	public static void main(String[] args) {
		String name = Actress1.getNameofFilm();
		System.out.println("Film name: "+name);
		String heroine = Actress1.getNameofHeroine();
		System.out.println("Heroine name: "+heroine);
		String actor = Actress1.getNameofActotr();
		System.out.println("Actor name: "+actor);
		String[] names = Actress1.getallroleinthisMovie();
		for(int i=0; i<names.length; i++){
			System.out.println("All name play role for film: "+names[i]);
		}
		Girls g = Actress1.actressDetail();
		System.out.println("Details os heroine");
		System.out.println("Actress name: "+g.name);
		System.out.println("Actress gender: "+g.gender);
		System.out.println("Actress phone number: "+g.phone);
		System.out.println("Actress address: "+g.address);
	}
}