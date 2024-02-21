class Student {
	static String schoolName = "Dps";
	String name;
	int age;
	int fees;

	 void printInfo() {
		System.out.println("welcome school name "+ Student.schoolName);
		System.out.println(name+ "studing at "+schoolName);
		System.out.println("school fees : "+fees);
		System.out.println(this.age);
	}
}

public class OOPS09 {
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.name = "Shradha";
		student1.fees = 5000;
		student1.age = 24;
		student1.printInfo();	
	}
}