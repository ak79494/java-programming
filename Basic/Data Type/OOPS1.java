class Student {
	String name;
	int age;

	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class OOPS1 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "shraddha";
		student1.age = 22;

		student1.printinfo();

	}
}