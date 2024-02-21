import java.util.*;
class ArrayAccending {
	public static void reverseOrder(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = {2,4,3,1,0,5};
		reverseOrder(arr);
		for(int e : arr) {
			System.out.print(e+" ");
			System.out.print("hi");
		}
	}
}