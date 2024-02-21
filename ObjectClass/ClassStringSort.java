import java.util.*;
class ClassStringSort {
	public static void main(String[] args) {
		String name =  "ellyse perry ";
		char[] arr =  name.toCharArray();
		Arrays.sort(arr);
		name = new String(arr);
		System.out.println(name);
		System.out.println();
	}
}