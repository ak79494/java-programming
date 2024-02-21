import java.util.*;
class Student implements Comparable{
	String name;
	int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;

	}
	public int compareTo(Object obj) {
		Student st = (Student)obj; // downcast
		return -(this.age-st.age); //Decending order

	}
	public String toString() {
		return "name: "+name+" age: "+age;
	}
}
class ApnaCollege {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Student("Allyse perry",25));
		set.add(new Student("Smriti mandanna",26));
		set.add(new Student("Denial waytt",29));
		set.add(new Student("Harleon deol",24));
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}