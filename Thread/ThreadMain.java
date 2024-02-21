class ThreadMain extends Thread{
	public static int amount = 0;
	public static void main(String[] args) {
		ThreadMain tm = new ThreadMain();
		Thread th = new Thread(tm);
		th.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
		
	}
	public void run() {
		amount++;
	}
}
// Concurrency Problems