import java.util.*;
class Reverse {
	public static void reverseOrder(int arr[]) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,0};
		reverseOrder(arr);
		for(int e : arr) {
			System.out.println(e+" ");
		}
	}
}