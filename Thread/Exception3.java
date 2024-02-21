import java.io.*;
class Exception3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{
			System.out.println("Program start");
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Program end");
		}
	}
}