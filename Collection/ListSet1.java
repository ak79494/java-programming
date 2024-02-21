import java.util.ArrayList;
import java.util.Collections;
class ListSet1 {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		list.add("India");
		list.add("Russia");
		list.add("Pakistan");
		list.add("England");
		list.add("England");

		System.out.println(list);
		list.remove(4);
		System.out.println(list);

		// add
		 Collections.addAll(list,"New zeland", "Australia");
		System.out.println(list); // india, Russia, pak, england nz, Aus

		// add in between
		list.add(4,"South africa");
		System.out.println(list); // india, Russia, pak, england,sa, nz, Aus

		//size
		int size = list.size();
		System.out.println(size);

	}
}