import java.util.*;
class Accending3 {
	public static void main(String[] args) {
		String name = "arun gosawmi";
		char[] arr = name.toCharArray();
		Arrays.sort(arr);
		 name = new String(arr);
		 System.out.println(name);
	}
}