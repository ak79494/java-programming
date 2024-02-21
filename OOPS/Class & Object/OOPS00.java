class Shape {
	String color;


	public void area(){
		System.out.println("Dispalys araea"); 
	}		
}

class Triangle extends Shape{            // derived class
	public void area(int l, int h){
		System.out.println(1/2*l*h);
	}
}
public class OOPS00{
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.color = "Red";
		t1.printInfo();
		
	}
}