import java.util.*;
class ForEachLoopUsing {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("India");
		l.add("Latvia");
		l.add("Russia");
		l.add("Ukraine");
		System.out.println("=======For each loop======");
		//iterate using for each loop
		for(String country : l) {
			System.out.println(country);
		}
		// using iterate
		System.out.println("=========Iterator=======");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("============List Iterator===========");
		ListIterator<String> l1 = l.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
	}
}