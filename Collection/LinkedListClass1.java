import java.util.*;
class LinkedListClass1 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("India");
		l.add("Russia");
		l.add("Pakistan");
		l.add("England");
		System.out.println(l); // 1 ind, rus,pak,eng
		// add first
		l.addFirst("India");
		l.addLast("England");
		//l.addLast("England");
		System.out.println(l); // 2 ind,ind, rus,pak,eng,eng

		
		System.out.println(l.get(2)); // 3 Russia
		l.add(3,"Pakistan");
		System.out.println(l);// 4 ind,ind, rus,pak, pak,eng,eng
		System.out.println(l.set(3,"Russia"));// 5 ind,ind, rus,rus,pak,eng,eng 
		//System.out.println(l);

		System.out.println(l.remove(3));
		System.out.println(l); 
		
	}
}