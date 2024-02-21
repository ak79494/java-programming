import java.util.*;
import java.util.Collections;
class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("India");
		l.add("Latvia");
		l.add("Russia");
		l.add("Ukraine");
		l.add("England");

		Iterator it = l.iterator();
		Collections.reverse(l);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=====Decending Order====");
		Collections.sort(l,Collections.reverseOrder());
		Iterator it1 = l.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		
		}
		System.out.println("=====Accending Order====");
		Collections.sort(l);
		Iterator it2 = l.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
}