class Principal3{
	public static void main(String[] args) {
		System.out.println("Principal can give student name");
		Teacher3.saveStudentName("kavya");
		System.out.println("Principal can share student roll number");
		Teacher3.saveStudentRoll(4);
		System.out.println("Principal can give student mark:");
		 Teacher3.SaveStudentMark(98);
		 System.out.println("Student phone number");
		 Teacher3.saveStudentNumber(2345678901L);
		 System.out.println("Principal sharing student numbers");
		 long[] phones = {1234567890L, 23456789012L};
		 Teacher3.saveStudentsNumber(phones);

	}
}