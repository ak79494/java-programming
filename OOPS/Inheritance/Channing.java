class Parent{
	String name;
    int age;
	Parent(){
		
        System.out.println("parameterised pass one argument");
        name = "shradha";
        age = 24;
		
	}
}
class Child extends Parent {
	String sex;
	Child(){
		sex = "female";
		System.out.println("no parameterised pass no argument");
	}
}
class Channing{
	public static void main(String[] args) {
		Child ch1 = new Child();
		System.out.println(ch1.name);
		System.out.println(ch1.age);
		System.out.println(ch1.sex);
	}
}