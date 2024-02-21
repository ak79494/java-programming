import java.util.*;
class AStringAccending {
	public static void main(String[] args) {
		String name = "ellyse alexandra perry";
		char[] arr = name.toCharArray();

		Arrays.sort(arr);
		name = new String(arr);
		System.out.println(name);
	}
}