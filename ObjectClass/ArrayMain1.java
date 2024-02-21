import java.util.*;
class Array2 {
	int[] arr;
	int idx;
	public Array2(int size) {
		arr = new int[size];
		idx = 0;
	}
	public void add(int num) {
		if(idx<arr.length) {
			arr[idx] = num;
			idx++;
		}else{
			System.out.println("Array is full");
		}
	}
	public void printArray() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
class ArrayMain1 {
	public static void main(String[] args) {
		Array2 arr = new Array2(4);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.printArray();
	}
}