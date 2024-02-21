import java.util.*;
class HashCodeToObject {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("India");
		hs.add("latvia");
		hs.add("Russia");
		hs.add("Ukraine");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Copying all the elements: ");
		Object[] obj = hs.toArray();
		for(Object country : obj) {
			System.out.println(country);
		}
		

	}
}