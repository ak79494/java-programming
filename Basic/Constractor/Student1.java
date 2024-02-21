class Student1{
	String name;
	int age;
	Student1(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[] args) {

		Student1 student2 = new Student1("Shradha", 24);
		student2.printInfo();
	}
}
 // parameterized constractor 