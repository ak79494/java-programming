import java.util.*;
class VectorStack {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("This");
		v.add("is");
		v.add("a");
		v.add("Vector");
		System.out.println("===============VECTOR============");
		System.out.println(v.get(1)); // is
		System.out.println(); // space
		v.add(4,"class");
		System.out.println(v); // this is a vector class 
		v.remove(4);
		System.out.println(v); // this is a vector
		System.out.println(v.firstElement()); // this
		System.out.println(v.lastElement()); // vector

		System.out.println();
		for(String name : v) {
			System.out.println(name); //this is a vector
			
		}
		System.out.println("============STACK=============");
		Stack<String> s = new Stack<>();
		s.push("This");
		s.push("is");
		s.push("a");
		s.push("Stack");
		System.out.println(s); // [This is a stack]
		System.out.println(s.peek()); // last element-->stack
		//System.out.println(s.size()); // 4
		System.out.println(s.pop()); // last element-->stack
		//System.out.println(s.size()); // 3
		System.out.println();
		while(s.size()>0) {
			System.out.println(s.pop());
		}
		
	}
}