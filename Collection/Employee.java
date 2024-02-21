public class Employee implements Comparable {
	String name;
	int id;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int compareTo(Object obj) {
		Employee employee = (Employee)obj;
		return this.id == employee.id&&this.name.equals(employee.name);
	}
	public String toString() {
		return "Name: "+name+",id:"+id;
	}

}