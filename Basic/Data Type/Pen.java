class Pen {
	String color;
	String type; //ballpoint; gel

	public void write() {
		System.out.println("writting something");
	}

}
public class OOPS {
	public static void main(String[] args) {
		pen pent1 = new pen();
		pen1.color = "blue";
		pen1.type = "gel";

		pen1.write();
	}
}