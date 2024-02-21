import java.util.*;
class ArrayListReadOnly {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Arun"); 
		list.add("Mukesh");
		list.add("Payal");
		list.add("Shekhar");
		list.add("Arun"); 
		System.out.println(list);
		 Collections.unmodifiableList(list);
	}
}