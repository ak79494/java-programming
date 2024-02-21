class Pen{
	String color;
	String type;

	public void write(){
		System.out.println("write something");
	}
	public void printinfo(){
		System.out.println(this.color);
		System.out.println(this.type);
	}
}
public class Pens2{
	public static void main(String[] args) {
		Pen p = new Pen();
		p.color = "Blue";
		p.type = "Ballpoint";

		Pen p1 = new Pen();
		p1.color = "black";
		p1.type = "gel";

		p.printinfo();
		p1.printinfo();
	}
}