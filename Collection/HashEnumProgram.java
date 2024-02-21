//Write a program in Java to display the contents of a HashTable using enumeration.
import java.util.*;
class HashEnumProgram {
	public static void main(String[] args) {
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("India",1);
		ht.put("Latvia",2);
		ht.put("Russia",4);
		ht.put("Ukraine",3);
		Enumeration e = ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}