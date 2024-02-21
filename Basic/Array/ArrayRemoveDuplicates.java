import java.util.*;
class ArrayRemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {2,2,5,5,6};
		HashSet<Integer> set = new HashSet<>();
		for(Integer val: arr) {
			if(set.add(val) == false){
				System.out.println(val+" ");
			}
		}
	}
}