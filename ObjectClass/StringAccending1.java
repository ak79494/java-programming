import java.util.*;
class StringAccending1 {
	public static void main(String[] args) {
		String name  ="sakshi";
		char[] arr = name.toCharArray();
		Arrays.sort(arr);

		name = new String(arr);
		System.out.println(name);
	}
}