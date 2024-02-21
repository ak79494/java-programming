class Employee{
	String name;
	static String company;
}
class OOPS001{
	public static void main(String[] args) {
		Employee.company = "Google";
		Employee  e = new Employee();
		e.name = "Shradh khapra";
		System.out.println(e.company);
		System.out.println(e.name);
		
	}
}