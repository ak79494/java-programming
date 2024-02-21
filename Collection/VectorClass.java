import java.util.*;
import java.util.Collections;
class VectorClass {
	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add("India");
		v.add("Russia");
		v.add("Pakistan");
		v.add("England");
		v.add("England");

		System.out.println(v);
		// addAll()
		Collections.addAll(v,"South Afria","Nz");
		System.out.println(v);
		// remove() South africa , new zealand
		System.out.println(v.remove(5));
		System.out.println(v.remove(5));
		System.out.println(v);
		System.out.println();

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		for(String name : v) {
			System.out.println(name);
		}

		


	}
}