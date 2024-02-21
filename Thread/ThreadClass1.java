class ThreadClass1 {
	public static void main(String[] args) {
		Thread t1 = new Thread("Shradha");
		Thread t2 = new Thread("Aman");
		t1.start();
		t2.start();

		String s1 = t1.getName();
		String s2 = t2.getName();
		System.out.println(s1);
		System.out.println(s2);
	}
}