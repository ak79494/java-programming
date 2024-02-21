class  ExceptionNullPointer1 {
	public static void main(String[] args) {
		System.out.println("program start");
		int a = 10;
		int b = 0;
		try{
			String name = null;
			name.concat("Hello");
			System.out.println(a/b);
			
		}catch(NullPointerException e) {
			e.printStackTrace();

		}catch(ArithmeticException e) {
			e.printStackTrace();

		}finally {
			System.out.println("This is finally method");
		}
		System.out.println("program end");

	}
}