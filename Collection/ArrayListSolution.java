import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
class Decending implements Comparator<String> {
	public int compare(String o1,String o2) {
		return -(o1.compareTo(o2));
	}
}
class ArrayListSolution {
	public static void swap(ArrayList<String> list, int idx1, int idx2) {
		String temp = list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("Latvia");
		list.add("Russia");
		list.add("England");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// Swap
		System.out.println();
		int idx1 = 2, idx2 = 3;
		swap(list,idx1,idx2);
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		Collections.sort(list);
		System.out.println(list);
		// Reverse
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list,new Decending());
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

		

	}
}