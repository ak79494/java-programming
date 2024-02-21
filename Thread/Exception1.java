import java.io.*;
class Exception1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{
			System.out.println("Program Start");
			System.out.println(a/b);	
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("Zero not allowed");
			System.out.println("Program end");

		}
	}
}