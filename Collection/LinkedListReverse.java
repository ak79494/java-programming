import java.util.*;
class LinkedListReverse {
	public static void reverselist(LinkedList<Integer> list) {
		// Reverse
		int i = 0, j = list.size()-1;
		while(i<j) {
			//swap method use
			Integer temp = Integer.valueOf(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
			
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		 reverselist(list);
		 System.out.println(list);
	}
}