class Shape1{
	int color;

}
class Triangle1 extends Shape1{

}
class Circle extends Shape1{

}
class Inheritance{
	public static void main(String[] args) {
		Triangle1 triangle = new Triangle1();
		triangle.color = "red";
		Circle circle = new Circle();
		circle.color = "blue";

	}
}