class Staticmethod{
	static int i = 40; // static method
	// non static method
	int j = 50;
	void simpledisplay(){
		System.out.println(i);
		System.out.println(j);
	}
	static void staticdisplay(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		Staticmethod obj = new Staticmethod();
		obj.simpledisplay();

		//call static mthod
		staticdisplay();
	}
}