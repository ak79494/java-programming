class Principal2{
	public static void main(String[] args) {
		String name = Teacher1.getStringName();
		System.out.println("Student name : "+name);
		int roll = Teacher1.getrollnumberStudent();
		System.out.println("princial can note student roll: "+roll);
		int mark = Teacher1.getmarkofStudent();
		System.out.println("Student mark: "+mark);
		long phone = Teacher1.getNumberStudent();
		System.out.println("Student phone number: "+phone);
		Student1 s = Teacher1.getallDetails();
		System.out.println("Student name: "+s.name);
		System.out.println("Student roll: "+s.roll);
		System.out.println("Student number: "+s.phone);
		System.out.println("Student gender: "+s.gender);
	}
}