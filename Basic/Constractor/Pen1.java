class Pen1{
	String color;
	String type;
	Pen1(String color, String type){
		this.color = color;
		this.type = type;

	}
	public void printInfo(){
		System.out.println(this.color);
		System.out.println(this.type);
	}
	public static void main(String[] args) {
		Pen1 pen2 = new Pen1("Blue","Ballpoint");
		pen2.printInfo();
		
	}
}
// parameterised constrctor.