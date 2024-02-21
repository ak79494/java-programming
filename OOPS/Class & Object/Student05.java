class Student05{
	String name;
	int id;
	String designation;
	Address address;
	Student05(String name, int id, String designation, Address address){
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.address = address;
	}
	void printInfo(){
		System.out.println("====Student Details====");
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("designation: "+designation);
		address.printDetails();
	}
}