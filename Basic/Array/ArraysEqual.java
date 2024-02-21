import java.util.*;
class ArraysEqual {
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,10};
		int[] arr2 = {2,4,5,8,10};
		int[] arr3 = {2,4,6,8,10};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr3));
	    System.out.println(Arrays.equals(arr1, arr3));
	}
}