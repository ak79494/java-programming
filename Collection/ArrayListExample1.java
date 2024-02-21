import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
class Decending implements  Comparator<String> {
	public int compare(String obj1, String obj2) {
		return -(obj1.compareTo(obj2));
	}
}
class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<>();
		list.add("Arun");
		list.add("Shradha");
		list.add("Aman");
		list.add("Rashmika");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Accending==========");
		Collections.sort(list);
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());         
		}
		System.out.println("============Decending============");
		Collections.sort(list, new Decending());
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());         
		}
		System.out.println("============Reverse============");
		Collections.reverse(list);
		Iterator it3 = list.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());         
		}
		System.out.println("=====================addAll==============");
		Collections.addAll(list,"Nora, Nora");
		Iterator it4 = list.iterator();
		while(it4.hasNext()) {
			System.out.println(it4.next());
        }
        list.add(1,"Katrina kaif");
        System.out.println(list);
        System.out.println("removing Element");
	    for(int i=0; i<list.size(); i++) {
		for(int j=i+1; j<list.size(); j++) {
			if(list.get(i).equals(list.get(j))) {
				list.remove(j);
				j--;
				
			}
		}
	}
	System.out.println(list);
	}
}