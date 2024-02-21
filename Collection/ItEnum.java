import java.util.*;
class ItEnum {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("India");
		v.add("Pakistan");
		v.add("Russia");
		v.add("Latvia");
		System.out.println(v);
		Enumeration enumerate = v.elements();
		while(enumerate.hasMoreElements()){
			System.out.println(enumerate.nextElement());
		}
		
	}
}