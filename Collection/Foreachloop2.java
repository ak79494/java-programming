import java.util.*;
class Foreachloop2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Arun");
		list.add("Payal");
		list.add("Shradha");
		list.add("Aman");
		//for each
		System.out.println("==========For each loop===========");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("==========Iterator=============");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============List iterator===========");
		ListIterator<String> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}


	}
}