import java.util.*;
class ArraySort {
	public static void sortOrder(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = {8, 6, 4, 0, 2, 1};
		sortOrder(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}

	}
}