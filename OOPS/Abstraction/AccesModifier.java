import java.util.*;
class Employee {
	private String name;
	private  String profession;
	private String sex;
	private long number;
	//Employee(String name,String profession,String sex,long number) {
	//	this.name = name;
	//	this.profession = profession;
	//	this.sex = sex;
	//	this.number = number;
	//}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String toString() {
		return "Name: "+name+ ", Profession: "+profession+ ", Sex: "+sex+ ",Number: "+number;
	}
}
class AccesModifier {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Shradha");
		e.setProfession("Software Engineer");
		e.setSex("Female");
		e.setNumber(123456789012L);
		//System.out.println(e.toString());

		System.out.println(e.getName());
		System.out.println(e.getProfession());
		System.out.println(e.getSex());
		System.out.println(e.getNumber());
		System.out.println(e.toString());
		
	}
}