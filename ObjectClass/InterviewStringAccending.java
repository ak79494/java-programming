import java.util.*;
class InterviewStringAccending {
	public static void main(String[] args) {
		String name = "jacquiline farnendez";
		char[] arr = name.toCharArray();
		Arrays.sort(arr);
		name = new String(arr);
		System.out.println(name);
	}
}