class Box{
	double length = 22;
	double breadth = 24;
	double height = 28;
	int boxno = 20;
	Box(double l, double b, double h, int num){
		length = l;
		breadth = b;
		height = h;
		boxno = num;

	}
	public static void main(String[] args) {
		Box box1 = new Box(1,2,3,4);

		System.out.println(box1.length);
		System.out.println(box1.breadth);
		System.out.println(box1.height);
		System.out.println(box1.boxno);
	}
}