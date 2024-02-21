import java.util.*;
class HashCodeToObject1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Allyse perry");
		set.add("Smriti mandanna");
		set.add("Denial waytt");
		set.add("Harleon deol");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Copying All The Element");
		Object[] obj = set.toArray();
		for(Object country : obj) {
			System.out.println(country);
		}
	}
}