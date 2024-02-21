class Pen {
	String color;
	String type; // ballpoint or gel

	//properties
	public void write(){
		System.out.println("Writting Something");
	}
	// function
	public void printColor(){
		System.out.println(this.color);
	}
}

public class OOPs {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";

		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";

		pen1.printColor();
		pen2.printColor();
		

	}
}