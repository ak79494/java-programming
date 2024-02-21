import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class SortElementArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Russia");
		list.add("Latvia");
		list.add("Ukraine");
		System.out.println("======Before Sorting=====");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========After Sorting========");
		Collections.sort(list);
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			
			System.out.println(it1.next());
		}
	}
}