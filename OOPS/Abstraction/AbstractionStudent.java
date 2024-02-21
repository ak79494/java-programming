abstract class Student {
	abstract void write();	
}			
class Shradha extends Student {
	void write() {
		System.out.println("Store MySQL Database server: Shradha writing java programming");
	}
}
class Aman extends Student {
	void write() {
		System.out.println("Store ORACLE Database server: Aman also write java programming");
	}
}
class Helperclass {
	static Student getteach(String type) {
	    if(type.equals("MySQL")) {
			return new Shradha();
		}else{
			return new Aman();
		}
	}
}
class AbstractionStudent {
	public static void main(String[] args) {
		Student student = Helperclass.getteach("Oracle");
		student.write();	
	}	
}