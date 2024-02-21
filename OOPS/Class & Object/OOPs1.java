class Student{
	String name;
	int age;

	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
public class OOPs1{
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Arun";
		student1.age = 24;

		student1.printInfo();

	}
}