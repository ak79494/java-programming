class Box {
	double length;
	double breadth;
	double height;
	int boxNo;
	Box(double l,double b,double h,int num) {
		length = l;
		breadth = b;
		height = h;
		boxNo = num;
	}
	Box() {
		length = breadth = height = 0;
	}
	Box(int num) {
		this();
		boxNo = num;
	}
}
class ConstaractorOverload {
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println(box.length);
	}
}