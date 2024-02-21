class ThreadDemo  implements Runnable {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() +": "+i);
		}
	}
}
class MultiThreading {
	public static void main(String[] args) {
		ThreadDemo td1 = new ThreadDemo();
		ThreadDemo td2 = new ThreadDemo();

		Thread th1 = new Thread(td1);
		Thread th2 = new Thread(td1);
		th1.start();
		th2.start();
		
	}
}