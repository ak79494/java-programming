import java.util.*;
class ArrayDuplicates {
	public static void printDuplicates(int[] arr) {
		int minimum = 0;
		HashSet set = new HashSet();
		for(int i=arr.length-1; i>=0; i--) {
			if(set.contains(arr[i])) {
				minimum = i;
			}else{
				set.add(arr[i]);
			}
			if(minimum != 0) {
				System.out.println("Duplicates: "+arr[minimum]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {24,22,26,24,22,24};
		printDuplicates(arr);
	}
}