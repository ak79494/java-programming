import java.io.*;
class Exception2 {
	public static void main(String[] args) {
		System.out.println("program start");
		int a = 24;
		int b = 0;
		try{
			String name = null;
			name.concat("Aman");
			System.out.println(a/b);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Zero not");
			System.out.println("program end");
		}
	}
}