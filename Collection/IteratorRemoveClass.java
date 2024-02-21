import java.util.*;
class IteratorRemoveClass {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Arun"); 
		l1.add("Mukesh");
		l1.add("Payal");
		l1.add("Shekhar");

		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			if(name.equals("Payal")) {
				it.remove();
				System.out.println("Payal removed");
			}
		}
		System.out.println(l1.size());
		
	}
}