import java.util.*;
class MainmethodOverloaded {
	public static void main(int args1) {
		System.out.println("main() overloaded"+ "method 1 executed");
	}
	public static void main(char args2) {

		System.out.println("main (overloaded" + "method 2 executed");	
	}
	public static void main(Double[] args3) {
		System.out.println("main() overloaded" + "method 3 executed");	
	}
	public static void main(String[] args) {
		System.out.println("Original main ()" + "executing");
	}
}

	