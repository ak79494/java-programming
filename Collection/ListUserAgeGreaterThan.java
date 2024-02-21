import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ApnaStudent {
	private int id;
	private String name;
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public ApnaStudent(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Age: "+age;
	}
	
}
public class ListUserAgeGreaterThan {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(
			new ApnaStudent(1,"Arun", 24),
		    new ApnaStudent(2,"Shradha", 26),
		    new ApnaStudent(3,"Aman", 28),
		    new ApnaStudent(3,"payal", 18));

		List<Integer> list1 = new ArrayList<>();
		for(ApnaStudent as : l1) {
			if(ApnaStudent.getAge() > 24) {
				list1.add(as.getAge());

			}
		}
		System.out.println(list1);

		
	}
}