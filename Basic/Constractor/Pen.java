class Pen{
	String color;
	String type;

	Pen(){
		color = "Blue";
		type = "Ballpoint";
	}
	public void printInfo(){
		System.out.println(this.color);
		System.out.println(this.type);
	}
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.printInfo();
		
	}
}
// Non paremeteri