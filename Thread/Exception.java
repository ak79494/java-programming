import java.io.*;
class Exception {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{
			System.out.println("Program start");
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Zero not Allowed");
			System.out.println("Program end");
		}
	}
}