import java.io.*;
class ExecptionFinal {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int result;
		try{
			System.out.println("Program start");
			System.out.println("result: "+ a/b);
		}finally{
			System.out.println("this is a finally block");
		}
		System.out.println("Program end");
	}
}