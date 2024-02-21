// Given an array in Java, convert it to a collection.
import java.util.*;
class ArrayCovertCollection {
	public static void main(String[] args) {
		String[] name = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int size = name.length;
		System.out.println("The input elements are as follows : ");
		for(int i=0; i<size; i++) {
			System.out.println(name[i]+" ");
		}
		System.out.println();
		List converted_list = Arrays.asList(name);

		// printed converted elemented
		System.out.println("The converted list is as follows : "+ converted_list);
	}
}