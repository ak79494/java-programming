class Student1{
	String name;
	int roll;
	long phone;
	String gender;
}
class Teacher1{
	static String getStringName(){
		System.out.println("Teacher can share the Student name");
		return "shradha";
	}
	static int getrollnumberStudent(){
		System.out.println("Teacher can the student roll number");
		return 1;
	}
	static int getmarkofStudent(){
		System.out.println("Techer can share the mark of student to princiapl");
		return 99;
	}
	static long getNumberStudent(){
		System.out.println("teacher can share student phone number to principal");
		return 1234567890L;
	}
	static Student1 getallDetails(){
		System.out.println("Teacher can share detail of student");
		Student1 s =new Student1();
		s.name = "Navya";
		s.roll = 2;
		s.phone = 2132132131L;
		s.gender = "Female";
		return s;
	}
}