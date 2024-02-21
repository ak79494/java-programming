import java.util.*;
class Student {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int hashCode(){
		return age;
	}
}
class Collections {
	public static void main(String[] args) {
		Set set = new HashSet();
		System.out.println(new Student("Arun").hashCode());
		System.out.println(new Student("Arun").hashCode());
		System.out.print(new Student("Arun",24).hashCode());
		System.out.print(new Student("Arun",24).hashCode());
		set.add("Arun"); 
		set.add("Mukesh");
		set.add("Payal");
		set.add("Shekhar");
		set.add("Arun"); 
		System.out.println(set.size());
		System.out.println(set);
		set.remove("Arun");
		System.out.println(set);
		
		
	}   
}