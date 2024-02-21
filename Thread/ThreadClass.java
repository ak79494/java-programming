class ThreadClass {
	public static void main(String[] args) {
		Thread t1 = new Thread("Hello Arun");
		t1.start();

		String s = t1.getName();
		System.out.println(s);

		
	}
}