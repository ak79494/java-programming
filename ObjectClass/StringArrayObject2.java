import java.util.*;
class BlackList {
	Object[] arr;
	int count;
	public BlackList(int length) {
		arr = new Object[length];
	}
	public void printArray() {
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public void add(Object element) {
		if(arr.length==count) {
			Object[] newArray = new Object[2*count];
			for(int i=0; i<count; i++) {
				newArray[i] = arr[i];
			}
		    arr = newArray;
		}
		arr[count++] = element;
	}
}
class StringArrayObject2 {
	public static void main(String[] args) {
		BlackList list = new  BlackList(4);
		list.add(0);
		list.add(1); 
		list.add(2); 
		list.add(3);
		list.printArray();  
	}
}