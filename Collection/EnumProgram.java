import java.util.*;
class EnumProgram {
	public static void main(String[] args) {
		Hashtable<String,Integer> list = new Hashtable<String,Integer>();
		list.put("Arun",1);
		list.put("Payal",2);
		list.put("Shradha",3);
		list.put("Aman",4);
		Enumeration e = list.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}