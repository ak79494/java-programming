class ThreadClass implements Runnable {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("This is Runnable interface");
		}
	}
}
class ThreadRunnable1 {
	public static void main(String[] args) {
		ThreadClass tcs1 = new ThreadClass();
		ThreadClass tcs2 = new ThreadClass();
		Thread t1 = new Thread(tcs1);
		Thread t2 = new Thread(tcs2);
		t1.start();
		t2.start();
	}
}