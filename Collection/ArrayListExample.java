import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
class Decending implements Comparator<String> {
	public int compare(String obj1, String obj2) {
		return -(obj1.compareTo(obj2));
	}
}
class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Shradha");
		list.add("Rasmika");
		list.add("Rasa");
		Iterator it = list.iterator();
        while(it.hasNext()) {
			System.out.println(it.next());
        }
        System.out.println("============Accending order== =======");
        Collections.sort(list);
		Iterator it1 = list.iterator();
        while(it1.hasNext()) {
			System.out.println(it1.next());
        }
        System.out.println("===========Decending Order==========");
        Collections.sort(list, new Decending());
        Iterator it2 = list.iterator();
        while(it2.hasNext()) {
			System.out.println(it2.next());
        }
	}
}