class Director{
	public static void main(String[] args) {
		String film = Actress3.getFilmName();
		System.out.println("Film; "+film);
		String name = Actress3.gethotActressname();
		System.out.println("Hot Actress name: "+name);
		String actor = Actress3.getActorname();
		System.out.println("Actor: "+actor);
		long phone = Actress3.getActressphone();
		System.out.println("Actress phone number: "+phone);
		 String[] names = Actress3.allActrssnamesfim();
		 for(int i=0;i<names.length;i++){
		 	 System.out.println("All actress: "+names[i]);
		 }
		
	}
}