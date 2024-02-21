class Actress{
	static void saveFilmName(String name){
		System.out.println("The create for new movie film name: "+name);
	}
	static void saveHeroineName(String name){
		System.out.println("which heroine can suit this film: "+name);
	}
	static void saveActorName(String name){
		System.out.println("Actor name of this film: "+name);
	}
	static void saveAllNameforThisMovie(String[] names){
		for(int i=0; i<names.length; i++){
			System.out.println("All name paly role for this movie: "+names[i]);
		}
	}
}