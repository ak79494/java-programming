import java.util.*;
class StringAccending0 {
	public static void main(String[] args) {
		String name = "shradha khapra";
		char[] arr = name.toCharArray();
		Arrays.sort(arr);
		name = new String(arr);
		System.out.println(name);
			for(int i=arr.length-1; i>=0; i--) {
				System.out.print(arr[i]+" ");
			}
	}

}