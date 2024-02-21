import java.util.*;
import java.util.Collections;

class Decending implements Comparator<String> {
		public int compare(String obj1, String obj2) {
			return -(obj1.compareTo(obj2));

		}
	}
class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Shradha");
		list.add("Arun");
		list.add("Aman");
		list.add("Apna");
		list.add("Apna");

		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============Decending========");
		Collections.sort(list, new Decending());
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		Collections.reverse(list);
		System.out.println(list);

		// remove Duplicate
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		System.out.println("Remove Dulplicate: "+list);


	}
}