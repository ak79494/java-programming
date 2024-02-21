class Student{
	String name;
	int age;
	Student(){
		name = "shradha";
		age = 24;
	}
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.printInfo();

	}
}
///// default constrator
/// non parameresid constractor