import java.util.HashSet;
import java.util.Iterator;
class HashSetToObjectConvert {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Aman");
		set.add("Arun");
		set.add("Shradha");
		set.add("Rashmika");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============HashSet to object===========t");
		Object[] obArr = set.toArray();
		for(Object name : obArr)
		System.out.println(name);
	}
}