import java.util.*;
class StackClass1 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("India");
		s.push("Russia");
		s.push("Pakistan");
		s.push("England");
		s.push("England");
		
		//System.out.println(s.peek());

		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
			System.out.println(s.size());

		}
		System.out.println();
		s.push("India");
		s.push("Russia");
		s.push("Pakistan");
		s.push("England");
		s.push("England");
		while(s.size()>0) {
			System.out.println(s.pop());
			System.out.println(s.size());
		}
	}
}