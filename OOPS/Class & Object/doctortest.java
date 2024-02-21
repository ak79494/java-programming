class Doctor{
	static String hospitalName = "AIIMS";
	String name;
	long phone;
	int age;
	int numberOfNurse;

	void printInfo(){

		System.out.println("Top one hospital: "+ Doctor.hospitalName);
	System.out.println("Doctor name : "+ name);
	System.out.println("Phone number : "+phone);
	System.out.println("age : "+age);
	System.out.println("number of nurse: "+numberOfNurse);
	}	
}
class Doctortest{
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor();
	doctor1.name = "Shradha";
	doctor1.phone= 7903508584L;
	doctor1.age = 24;
	doctor1.numberOfNurse = 24;
	doctor1.printInfo();
	}
}