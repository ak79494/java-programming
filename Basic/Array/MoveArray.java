import java.util.*;
public class MoveArray {
	public static void move(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {

		int[] arr = {2,0,6,8};
		move(arr);
		for(int e : arr) {
			System.out.print(e+" ");
	       System.out.print("hi");
		} 
	}
}