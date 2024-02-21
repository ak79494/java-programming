import java.util.*;
class ArrayConertCollections { 
	public static void main(String[] args) {
		String[] name = {"Monday", "Tuesday", "Wednesday", "Thrusday"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+" ");
		}
		System.out.println();
		List converted_list = Arrays.asList(name);
		System.out.println("Converted list : "+converted_list);
	}
}