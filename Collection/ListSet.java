import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
class ListSet {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		System.out.println("=========LIST===========");

		System.out.println("List: "+list); // 1 2 3 4
		list.remove(0); 
		System.out.println(list);// 2 3 4 1
		boolean b = Collections.addAll(list,1,2,3,5);
		System.out.println(b); //true
		System.out.println(list); // 2 3 4 1 1 2 3 5
		System.out.println();

		HashSet set = new HashSet();
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);
		set.add(2);
		System.out.println("===========SET=========");
		System.out.println("Set: "+set);
		set.remove(2);
		System.out.println(set);
	}
}