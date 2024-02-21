import java.util.*;
class IteratorClass {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Arun"); 
		l1.add("Mukesh");
		l1.add("Payal");
		l1.add("Shekhar");
		Iterator it = l1.iterator();
		
	
		while(it.hasNext()) {
			System.out.println(it.next());

		}

	}
}