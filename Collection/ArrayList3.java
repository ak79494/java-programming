import java.util.*;
class ApnaStudent implements Comparable {
	int id;
	String name;
	ApnaStudent(int id, String name) {
		this.id = id;
		this.name = name;

	}
	public int compareTo(Object obj) {
		ApnaStudent apna = (ApnaStudent)obj;
		return this.id-apna.id;
	}
	public String toString() {
		return "id: "+id+ ", salary: "+name;
	}
}
class ArrayList3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new ApnaStudent(25000,"Aman"));
		set.add(new ApnaStudent(10000,"sonu"));
		set.add(new ApnaStudent(55000,"Shradha"));
		set.add(new ApnaStudent(35000,"Arun"));
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}