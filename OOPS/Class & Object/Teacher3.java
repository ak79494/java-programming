class Teacher3{
	static void saveStudentName(String name){
		System.out.println("Student name: "+name);
	}
	static void saveStudentRoll(int roll){
		System.out.println("Student roll number: "+roll);
	}
	static void SaveStudentMark(int mark){
		System.out.println("Student mark: "+mark);
	}
	static void saveStudentNumber(long phone){
		System.out.println("Student phone: "+phone);
	}
	static void saveStudentsNumber(long[] phones){
		System.out.println("Techer Saving the phone numbers");
		for(int i=0; i<phones.length; i++){
			System.out.println("Saving numbers: "+phones[i]);
		}
	}

}