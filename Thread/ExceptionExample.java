class ExceptionExample {
	public static void main(String[] args) {
		System.out.println("program Start");
		int a = 10;
		int b = 0;
		try{
			String name = null;
			name.concat("khapra");
			System.out.println(a/b);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		 	System.out.println("Zero are not allowed");  
		}
		finally {
			System.out.println("This is finally method");
		}
		System.out.println("Program end");
	}
}