class Director4{
	public static void main(String[] args) {
		System.out.println("Relationsship movie actress name");
		Actress4.saveactressname("Shradha khapra");
		System.out.println("Actor name");
		Actress4.saveActorname("Arun");
		System.out.println("All Actress name");
		String[] names = {"Rashmika mandananna, Shradha khapra,nora"};
		Actress4.saveallActressnames(names);
	}
}