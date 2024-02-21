class girl{
	String name;
    int roll;
    long phone;
    String gender;
}
class Teacher{
	static String[] getStudentsName(){
		System.out.println("Teacher can share the students name to principal");
		String[] names = {"Shradha khapra, vansika, kavaya"};
		return names;
	}
	static int[] getRollNumbers(){
		System.out.println("Teacher can share roll number of student to principal");
		int[] rolls = {1,2,3};
		return rolls;
	}
	static long[] getStudentsnumber(){
		System.out.println("Teacher can share students number");
		long[] phones = {1234567890L, 2345678901L,3456789012L};
		return phones;
	}
	static Girl getDetails(){
		System.out.println("Teacher can share girls details");
		Girl g = new  Girl();
		g.name = "Navya";
		g.roll = 4;
		g.phone = 5678901234L;
		g.gender = "Female";
		return g; 
	}
}