class Producer{
	public static void main(String[] args) {
		System.out.println("Producer can save idea of new movie film name");
		Actress.saveFilmName("Baghwan");
		System.out.println("Heroine name play role for this movie");
		Actress.saveHeroineName("Rashmika mandanna");
		System.out.println("Playbrole for this movie actor name");
		Actress.saveActorName("Vickky kaushal");
		System.out.println("Play role for this movie");
		String[] names = {"Rashmika manadanna, vickky kaushal ,nora  fathei, Sara ali khan"};
		Actress.saveAllNameforThisMovie(names);
	}
}