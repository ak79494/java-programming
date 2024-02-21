class Block{
	static int i;
		static{ // first block
			System.out.println("First static block start");
			i=10;
			System.out.println("i: "+i);
		}
		static{
			System.out.println("second static block execute");
			i=20;
			System.out.println("i: "+i);
		}
		public static void main(String[] args) {
			System.out.println("main method execute");
	}
}