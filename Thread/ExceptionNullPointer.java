import java.io.*; 
class ExceptionNullPointer {
	public static void main(String[] args) {
		System.out.println("Program start");
		int a = 10;
		int b = 0;
		try{
			String name  = null;
			name.concat("Hello");
			System.out.println(a/b);	
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally{
			System.out.println("this is a finally method");
		}
		System.out.println("Program end");
	}
}