import java.util.*;
class ReverseNumber {
	public static void reverseArray(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = {2,3,4,0,1};
		reverseArray(arr);
		for(int e : arr)
			System.out.print(e+" ");

	}
}