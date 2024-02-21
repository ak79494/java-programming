import java.util.*;
class SwapString {
	public static void main(String[] args) {
		String name = "Arun goswami";
		String[] arr = name.split(" ");
		String namereverse =  " ";
		for(int i=arr.length-1;i>=0; i--) {
			namereverse = namereverse + arr[i]+" ";
		}
		System.out.println("Before change: "+name);
		System.out.println("After change: "+namereverse);
	}
}