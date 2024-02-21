 import java.util.*;
class EmployeeObject {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new Employee("Aman", 25000));
		ts.add(new Employee("sonu", 10000));
		ts.add(new Employee("Shradha", 55000));
		ts.add(new Employee("Arun", 35000));
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		};

	}
}
//new EmployeeNameWiseSort()