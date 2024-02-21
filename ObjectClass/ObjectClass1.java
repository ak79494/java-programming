class Aman {
	String type = "boys";
	public static void display() {
		System.out.println("Aman is the software developer");
		System.out.println("Aman newly married with Shrada khapa");
		System.out.println("Shradha khapra are also one of the best software developer");

	}
}
class ObjectClass1 {
	public static void main(String[] args) {
		Aman a1 = new Aman();
		//Aman a2 = new Aman();
	//	Aman a3 = new Aman();
		Aman[] aman = {a1};

		for(Aman a : aman) {
			System.out.println(a.type);
			a.display();
		}

	}
}