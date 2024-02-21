import java.util.*;
class ArraySort2 {
	public static  void sortOrder(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		int[] arr = {2,0,1,4,3,6};
		sortOrder(arr);
		for(int e : arr) 
			System.out.print(e+" ");
		
	}
}