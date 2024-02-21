class Bank{
	String account;
	String ifsc;
	public void facility(){
		System.out.println("Bank provide a facilty to customer");
	}
}
class Manager extends Bank {
	String name;
	int salary;
	public void operate(){
		System.out.println("Manager can operate a bank");
	}
}
class DeptManager extends Manager {
	String name;
	public void manage(){
		System.out.println("DBM can control bank");
	}
}
class Inherits{
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.facility();
		m1.name = "Shradha";
		m1.salary = 50000;
		m1.account = "ICICI";
		m1.ifsc = "ICIC00011";
		System.out.println("Manager Name: "+m1.name);
		System.out.println("Salary: "+m1.salary);
		System.out.println("account: "+m1.account);
		System.out.println("ifsc: "+m1.ifsc);
		m1.facility();
		m1.operate();

		DeptManager dm = new DeptManager();
		dm.name = "Nora";
		dm.salary = 40000;
		System.out.println("Dbm name: "+dm.name);
		System.out.println("salary: "+dm.salary);
		dm.manage();
	}
}