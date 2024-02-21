import java.util.*;
class StackReverse2 {
	public static void pushAtBottom(int data, Stack<Integer> s) {
		while(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(data,s);
		s.push(top);
	}
	public static void reverse(Stack<Integer> s ) {
		while(s.isEmpty()) {
			return;

		}
		int top = s.pop();
		reverse(s);
		pushAtBottom(top,s);
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);

		reverse(s);
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}