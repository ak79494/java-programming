class MyAnimal implements Runnable {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Animal walks "+i);
		}
		
	}
}
class ThreadExample {
	public static void main(String[] args) {
		MyAnimal m1 = new MyAnimal();
		MyAnimal m2 = new MyAnimal();
		Thread th1 = new Thread(m1);
		Thread th2 = new Thread(m2);
		th1.start();
		th2.start();
	}
}