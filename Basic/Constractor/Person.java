class Person{
	String name;
	int age;
	Person(){

	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void printInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		Person person = new Person();
		person. printInfo();
		Person person2 = new Person("Shradh", 24);
		person2.printInfo();
	}
}
/// constructor overloading