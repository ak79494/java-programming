
import java.util.*;
import java.util.stream.Collectors;
class Student {
	String name;
	String department;
	Student(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String toString() {
		return "Name: "+name+" Department: "+department;
	}
	
}
public class Java8Features1 {
	public static void main(String[] args) {
		List<Student> st1 = Arrays.asList(
       al.add(new Student("john","IT"),
       al.add(new Student("Mary", "Finance"),
       al.add(new Student("Peter", "HR"),
       al.add(new Student("Mary","Finance"),
       al.add(new Student("Michal","IT"),
       al.add(new Student("Mary","Finance")
   );
       Map<String,Integer> departmentStudentCount = new HashMap<>();
       for(Student val : st1) {
       	String department = val.getDepartment();
       	if(!departmentStudentCount.containsKey(department)) {
       		departmentStudentCount.put(department,1);

       	}
       	else{
       		
       	}
       }

	}

}