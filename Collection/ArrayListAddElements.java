import java.util.*;
class ArrayListAddElements {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("India");
		list.add("latvia");
		list.add("Russia");
		list.add("Ukraine");
		System.out.print("ArrayList after adding element: ");
		list.add(3, "England");
		System.out.println(list);

		list.set(4,"Australia");
		System.out.println(list);

	}
}