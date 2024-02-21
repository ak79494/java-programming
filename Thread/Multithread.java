class ThreadDemo extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Shradha is a girl : "+Thread.currentThread().getName()+": "+i);
		}
	}
}
class MultiThread {
	public static void main(String[] args) {
		ThreadDemo td1 = new ThreadDemo();
	    ThreadDemo td2 = new ThreadDemo();
	    Thread th1 = new Thread(td1);
	    Thread th2 = new Thread(td2);
	    th1.start();
	    th2.start();
	}
	

}