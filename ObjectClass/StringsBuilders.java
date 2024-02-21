import java.util.*;
class StringsBuilders {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Shradha");
		System.out.println(sb);
		// insert (add any value)
		sb.insert(1, 'A');
		System.out.println(sb);

		// delete 
		sb.delete(0,1);
		System.out.println(sb);

		//insert
		sb.insert(4,'d');
		System.out.println(sb);

		// delete
		sb.delete(4,5);
		System.out.println(sb);

		// set
		sb.setCharAt(0, 'A');
		System.out.println(sb);

		// insert
		sb.insert(1, 'S');
		System.out.println(sb);

		// delete
		sb.delete(0,1);
		System.out.println(sb);

		//Append
	}

}