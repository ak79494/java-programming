import java.util.*;
class Student implements Comparable {
	String name;
	int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	public int compareTo(Object obj) {
		Student s = (Student)obj;
		return -(this.age-s.age); 
	}
	public String toString() {
		return "Name: "+name+ ", age: "+age;
	}
}
class TreeSet01 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StudentNameWiseSort1());
		t.add(new Student("Aman", 26));
		t.add(new Student("Arun",24));
		t.add(new Student("Shradha",23));
		t.add(new Student("Nora",29));
		Iterator it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}