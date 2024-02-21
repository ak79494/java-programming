import java.util.*;
class SortAccendingsString {
	public static void main(String[] args) {
		String name = "shradha";
		char[] arr = name.toCharArray();

		Arrays.sort(arr);

		name = new String(arr);
		System.out.println(name);
	}
}