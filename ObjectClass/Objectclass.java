class Shradha{
	String type = "girls";
	public static void  watch() {
		System.out.println("watching Array object");
		System.out.println("watching you tube video");
		System.out.println("watching gadar 2");
	}
}
class Objectclass {
	public static void main(String[] args) {
		Shradha s1 = new Shradha();
		Shradha s2 = new Shradha();
		Shradha s3 = new Shradha();
		Shradha[] shradha = {s1,s2,s3};
		
		for(Shradha s : shradha) {
			System.out.println(s.type);
			s.watch();

		}
		
	}
}