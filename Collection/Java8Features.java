import java.util.*;
import java.util.stream.Collectors;
class Student {
	int id;
	String name;
	int age;
	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Age: "+age;
	}
}
public class Java8Features {
	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
       al.add(new Student(1,"Arun",24));
       al.add(new Student(2,"payal",18));
       al.add(new Student(3,"shradha",26));
       al.add(new Student(4,"Aman",28));
       List listAge = al.stream().filter(e -> e.age>= 24).map(e -> e.age).collect(Collectors.toList());
       System.out.println(listAge);
       

	}

}