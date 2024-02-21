//===========constractor overloading========================================
class Consractorbox{
	double length,breadth, height;
	int boxno;
	Consractorbox(double l, double b, double h,int num){
		length = l;
		breadth = b;
		height = h;
		boxno = num;

	}
	Consractorbox(){
		length = breadth = height =0;
	}
	Consractorbox(int num){
		this();
		boxno = num;

	}
	public static void main(String[] args) {
		Consractorbox obj = new Consractorbox();
		System.out.println(obj.length);
		System.out.println(obj.breadth);
		System.out.println(obj.height);
	}
}