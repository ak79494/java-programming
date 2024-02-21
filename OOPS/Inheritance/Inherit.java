class Shape {
	public void size(){
		System.out.println("Display the size");
	}
}
class Triangle1 extends Shape {
	public void area(int l,int h){
		System.out.println(1/2*l*h);
	}
}
class Singlelevel {
	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1();
		t1.size();
	}
}