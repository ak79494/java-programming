import java.util.*;
class ApnaSchool {
	String name;
	int age;
	ApnaSchool(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		ApnaSchool apna = (ApnaSchool)obj;
		return this.age==apna.age && this.name.equals(apna.name);
	}
	public String toString() {
		return "Name: "+name+" age: "+age;
	}
}
class LinkedHahSet4 {
	public static void main(String[] args) {
		HashSet set = new LinkedHashSet();
		set.add(new ApnaSchool("Arun",24));
		set.add(new ApnaSchool("Payal",18));
	    set.add(new ApnaSchool("Shradha",24));
        set.add(new ApnaSchool("Aman",24));
        	System.out.println(set);
        	System.out.println(set.remove("Aman"));
	}
}