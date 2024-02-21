import java.util.*;
class ComparableComparaterStudent {
	public static void main(String[] args) {
		//Set set = new TreeSet();
		Set set = new TreeSet(new StudentNameWiseSort());
		set.add(new Student("Shekhar",100));
		set.add(new Student("Mukesh",300));
		set.add(new Student("Arun",200));
		set.add(new Student("Payal",400));
		System.out.println(set);

	}
}