import java.util.*;
class ArraySort1 {
	public static void reverseOrder(int[] arr){
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = { 2,5,3,0,1};
		reverseOrder(arr);
		for(int e : arr)
			System.out.println(e+" ");
	}
}