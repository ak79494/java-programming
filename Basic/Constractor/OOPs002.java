class Pen{
	String color;
	static String company;
}
class OOPs002{
	public static void main(String[] args) {
		Pen.company = "Google";
		Pen p = new Pen();
		p.color = "Color";
		System.out.println(p.company); 
		System.out.println(p.color);
	}
}