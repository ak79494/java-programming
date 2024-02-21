import java.util.List;
import java.util.Set;
class ListSet {
	public static void main(String[] args) {
		List list = new List();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		 
		Set set = new Set();
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);

		System.out.println("List: "+list);
		System.out.println("Set: "+set);
	}
}