class Pen{
	String color;
	String type;

	public void write(){
	System.out.println("Write something");

	}
	public void printInfo(){
		System.out.println(this.color);
		System.out.println(this.type);
	}
}
class Pen2{
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "Blue";
		pen1.type = "Ballpoint";
		p.printInfo();
	}
}