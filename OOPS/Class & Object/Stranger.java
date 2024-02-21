class Patient{
	String name;
	String address;
	long phone;
}
class Stranger{
	static void tellmePatientName(){
		System.out.println("the patient name is aliya");
	}
	static int getPatientAge(){
		System.out.println("The stranger share the patient age");
		return 24;
	}
	static int getPatientFees()	{
		System.out.println("Stranger person can give the fees of doctor");
		return 5000;
	}
	static Patient getPatientDetails(){
		System.out.println("Stranger person can share the passanger deatils");
		Patient p = new Patient();
		p.name = "Aliya bhatt";
		p.address = "Mumbai";
		p.phone = 1234567890L;
		return p;
	}
}