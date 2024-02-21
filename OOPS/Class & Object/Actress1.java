class Girls{
	String name;
	String gender;
	long phone;
	String address;
}
class Actress1{
	
		static String getNameofFilm(){
			System.out.println("producer can share the name of film");
			return "Relationship";
		}
		static String getNameofHeroine(){
			System.out.println("Producer can share the share the name of heroine");
			return "Shradha khapra";
		}
		static String getNameofActotr(){
			System.out.println("Producer can the role paly actor name");
			return "Arun";
		}
		static String [] getallroleinthisMovie(){
			System.out.println("all the actor and heroinre can role in this movie");
			String[] names = {"Arun,Shradha,nora, rashmika, jacquiline"};
			return names;
	}
	static Girls actressDetail(){
		System.out.println("Heroine Details");
		Girls g = new Girls();
		g.name = "Shradha khapra";
		g.gender = "Female";
		g.phone = 1234567890L;
		g.address = "Mumbai";
		return g;
	}
}