import java.util.*;
class TwoArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("India");
		l1.add("Latvia");
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Russia");
		l2.add("Ukraine");
		l1.addAll(l2);
		System.out.println(l1);
	}
}