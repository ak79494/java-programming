class Student {
	String name;
	int age;

	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);

	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class OOPS2 {
	public static void main(String[] args) {
		Student student1 = new Student("shraddha", 22);
		student1.printinfo();

	}

}