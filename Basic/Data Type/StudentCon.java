class StudentCon {
	String name;
	int age;

	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);

	}

	    (String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class OOPS1 {
	public static void main(String[] args) {
		Student student1 = new Student("shraddha, 24");
		student1.printinfo();

	}

}