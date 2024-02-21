class Principal{
	public static void main(String[] args) {
		String[] names = Teacher.getStudentsName();
		System.out.println("Principal can check the students name");
		for(int i=0; i<names.length; i++){
			System.out.println("Students name : "+names[i]);
		}	
		int[] rolls = Teacher.getRollNumbers();
		System.out.println("Princial can match the match the students names and roll number");
		for(int j=0; j<rolls.length; j++){
			System.out.println("Roll nubers : "+rolls[j]);

		}
		long[]phones = Teacher.getStudentsnumber();
		System.out.println("Principal can note student phones numbers");
		for(int k=0; k<phones.length; k++){
			System.out.println("Students phone number : "+phones[k]);	
		}
		Girl g = Teacher.getDetails();
		System.out.println("Save the girls details");
		System.out.println("Student name: "+g.name);
		System.out.println("Roll number: "+g.roll);
		System.out.println("student phone: "+g.phone);
		System.out.println(" Student Gender: "+g.gender);
	}
}