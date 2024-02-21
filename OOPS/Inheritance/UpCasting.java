class Pen {
	String name;
	public void write() {
		System.out.println("Write something");
	}
}
class Blackpen extends Pen {
	String type;
	public void display() {
		System.out.println("display the pen quality");
	}
} 
class UpCasting {
	public static void main(String[] args) {
		Pen p = new Blackpen();
		p.name = "likho pikho";
		System.out.println("pen brand : "+p.name);
		p.write();

		Blackpen b = (Blackpen)p;
		b.type = "ballpoint";
		System.out.println("pen type : "+b.type);
		System.out.println("pen name : "+b.name);
	}
}