class Student {
	public void study() {
		System.out.println("the student are study in the School");
	}
}
class Sonu extends Student  {
	public void boys() {
		System.out.println("Sonu is a boy");
	}
}
class Shradha extends Student{
	public void girl() {
		System.out.println("Shradha is a girl");
	}
}
class SchoolCasting {
	public static void main(String[] args) {
		 Student s1 = new Sonu();
		 s1.study();

		 Sonu s2 = (Sonu)s1;
		 s2.boys();

		  Student s3 = new Shradha();
		  s3.study();
		  Shradha s4 = (Shradha)s3;
		  s4.girl();

	}
}