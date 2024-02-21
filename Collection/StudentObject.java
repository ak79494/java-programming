import java.util.*;
class StudentObject {
	public static void main(String[] args) {
	//	TreeSet ts = new TreeSet(new StudentNameWiseSort());
		TreeSet ts = new TreeSet();
		ts.add(new Student("Arun",24));
		ts.add(new Student("Shradha",23));
		ts.add(new Student("Rasmika",28));
		ts.add(new Student("Rasa",25));
		Iterator it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}