import java.util.*;
import java.util.Collections;
class ArrayListDecendingOrder {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list); 

		Collections.reverse(list);
		System.out.println(list);
	}

}