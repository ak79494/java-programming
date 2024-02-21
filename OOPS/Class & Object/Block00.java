class Block00{
	static int i;
	static int j;
	static{
		System.out.println("Execute 1st block");
	i=10;
	System.out.println("i: "+i);
	}
	static{
		System.out.println("Execute 2nd block");
	  j=10;
	System.out.println("j: "+j);
	}
	public static void main(String[] args) {
		System.out.println("execute main method");

	}
}