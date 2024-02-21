class Pens00{
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
class Penstest{
	public static void main(String[] args) {
		Pens00 pen1 = new Pens00();
		pen1.color =  "Blue";
		pen1.type = "Ballpoint";
		pen1.printinfo();
	}
}