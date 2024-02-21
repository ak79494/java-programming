import java.util.*;
class CommonlyUsedMethod1 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Disha");
		list1.add("Rasa");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("India");
		list2.add("Latvia");
		list2.add("Disha");
		list2.add("Rasa");
		if(list1.containsAll(list2)) {
			System.out.println("Available");
		}else{
			System.out.println("Not Available");
			if(list2.containsAll(list1)) {
				System.out.println("Available");
			}else{
				System.out.println("Not Available");
			}
		}
		System.out.println();
		// iterator()

		Iterator<String> it = list2.iterator();
		while(it.hasNext()) {
			String name = it.next();
		    System.out.println(name);
		}
		Object[] array = list1.toArray();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}