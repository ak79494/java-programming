import java.util.*;
class Employee {
		int id;
	    String name;
	    int age;
	    String gender;
	   
	Employee(int id,String name, int age,String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	public String toString() {
		return id+" "+name+", "+age+" "+gender;
	}
	
}

class ListUser {
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"sonu",49,"male"));
		list.add(new Employee(1,"rasa",29,"female"));
		list.add(new Employee(1,"paawan",39,"male"));
		list.add(new Employee(1,"jony",50,"male"));

		ArrayList<Employee> list1 = new ArrayList<>();
		for(Employee employee : list) {
			if(employee.age>40) {
				list1.add(employee);
			}
		}
		System.out.println(list1); 
		
	}
		
}