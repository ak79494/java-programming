import java.util.*;
class AccendingArray {
	public static void accendingOrder(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = {0,2,1,4,3,6};

		accendingOrder(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}
	}
}