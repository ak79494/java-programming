class Actress4{
	static void saveactressname(String name){
		System.out.println("Actress name: "+name);
	}
	static void saveActorname(String actor){
		System.out.println("Actor name: "+actor);
	}
	static void saveallActressnames(String[] names){
		for(int i=0;i<names.length; i++){
			System.out.println("Actress name: "+names[i]);
		}
		
	}
}