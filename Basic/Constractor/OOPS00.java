class Student4{
	String name;
		static String school;
	}
	class OOPS00{
		public static void main(String[] args) {
			Student4.school = "DAV";
			Student4 s = new Student4();
			s.name = "Shradha khapra";
			System.out.println(s.school);
			System.out.println(s.name);
	}
	
}