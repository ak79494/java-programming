import java.util.*;
class LinkedListReverse1 {
	public static void reverselist(LinkedList<Integer> list) {
		int i = 0, j=list.size()-1;
		while(i<j) {
			Integer temp = Integer.valueOf(i);
			list.set(i, list.get(j));
			list.set(j,temp);
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		 LinkedList<Integer> list= new LinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		reverselist(list);
		System.out.println(list);
	}
}