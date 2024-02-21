import java.util.*;
class StackReverse1 {
	public static void pushAtBottom(int data, Stack<Integer> st) {
		if(st.empty()) {
			st.push(data);
			return;

		}
		int top = st.pop();
		pushAtBottom(data,st);
		st.push(top);

	}
	public static void reverse(Stack<Integer> st ) {
		if(st.isEmpty()) {
			return;
		}
		int top = st.pop();
		reverse(st);
		pushAtBottom(top,st);
		
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);

		reverse(st);
		while(!st.empty()) {
			System.out.println(st.peek());
			st.pop();
		}

	}
}